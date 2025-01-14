package oops.anonymous;

public class Demo3 {
    public static void main(String[] args) {
        interface MessageService {
            void sendMessage();
        }

        //traditional way
        class MessageServiceImpl implements MessageService {
            public void sendMessage() {
                System.out.println("sending message using message service implementation");
            }
        }
        MessageService service = new MessageServiceImpl();
        service.sendMessage();

        //anonymous class way
        MessageService service2 = new MessageService() {
            public void sendMessage() {
                System.out.println("sending message using message anonymous implementation");
            }
        };
        service2.sendMessage();

    }
}
