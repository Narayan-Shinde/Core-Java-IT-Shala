package oops.anonymous;

public class Demo4 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface MessageService {
            void sendMessage();
        }

        //1. traditional way
        class MessageServiceImpl implements MessageService {

            public void sendMessage() {
                System.out.println("sending message using message service implementation");
            }
        }
        MessageService service = new MessageServiceImpl();
        service.sendMessage();

        //2. anonymous class way
        MessageService service2 = new MessageService() {
            public static final int variable = 100;
            public void sendMessage() {
                System.out.println("sending message using message anonymous implementation");
            }
            void m2(){}
        };
        service2.sendMessage();
        //System.out.println(service2.variable);
        //service2.m2();

        //3. lambda expression
        MessageService service3 = () -> System.out.println("sending message using message lambda implementation");
        service3.sendMessage();


    }
}
