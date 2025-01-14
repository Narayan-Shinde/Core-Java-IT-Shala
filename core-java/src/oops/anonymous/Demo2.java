package oops.anonymous;

public class Demo2 {
    public static void main(String[] args) {
        abstract class MessageService {
            abstract void sendMessage(String msg);
        }

        class MessageServiceImpl extends MessageService {
            @Override
            void sendMessage(String msg) {
                System.out.println("sending message using subclass");
            }
        }
        MessageService service = new MessageServiceImpl();
        service.sendMessage("Hello World");

        //anonymous class
        MessageService service2 = new MessageService() {
            @Override
            void sendMessage(String msg) {
                System.out.println("sending message using anonymous class");
            }
        };
        service2.sendMessage("Hello World");


    }
}
