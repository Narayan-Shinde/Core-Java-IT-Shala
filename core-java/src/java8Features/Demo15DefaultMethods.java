package java8Features;

public class Demo15DefaultMethods {
    public static void main(String[] args) {
        interface MessageService {
            void sendMessage();

            default void receiveMessage() {
                System.out.println("default method : receiving message");
            }
        }
        class MessageServiceImpl implements MessageService {
            @Override
            public void sendMessage() {
                System.out.println("sending message");
            }

            @Override
            public void receiveMessage() {
                MessageService.super.receiveMessage();
                System.out.println("receive message overridden");
            }
        }
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();
        messageService.receiveMessage();
    }
}
