package oops.abstraction;

public class Demo10 {
    public static void main(String[] args) {
        //IV, IM, blocks, constructor, inner classes
        //variables : public static final
        //methods : public abstract
        // abstract --> java 7
        // abstract, static, default --> java 8
        //nested classes --> public static
        interface MessageService {
            void sendMessage(String message);

            void receiveMessage(String message);
        }
        class EmailService implements MessageService {
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message " + message);
            }

            @Override
            public void receiveMessage(String message) {
                System.out.println("receiving message " + message);
            }
        }

        MessageService messageService = new EmailService();
        messageService.sendMessage("Hello World");
        messageService.receiveMessage("Hello World");
    }
}
