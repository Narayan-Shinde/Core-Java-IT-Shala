package multithreading.interThreadCommunication;

public class Demo1 {
    public static void main(String[] args) {
        class Message {
            String message;

            synchronized public void sendMessage() {
                System.out.println("sending the message " + Thread.currentThread().getName());
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("wait resumed");
            }

            synchronized public void receiveMessage() {
                System.out.println("message received " + Thread.currentThread().getName());
                notify();
            }
        }
        Message message = new Message();

        Thread sender = new Thread(() -> {
            message.sendMessage();
        }, "sender");
        Thread receiver = new Thread(() -> {
            message.receiveMessage();
        }, "receiver");
        sender.start();
        receiver.start();
    }
}
