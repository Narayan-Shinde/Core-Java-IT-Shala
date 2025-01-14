package oops.polymorphism.methodOverriding;

public class Demo1 {
    public static void main(String[] args) {
        class MessageService {

            public void sendMessage(String message) {
                System.out.println("sendMessage using text from messageService");
            }

            Throwable add(byte b1, byte b2) {
               return null;
            }
            static void m1(){}
        }
        class EmailService extends MessageService {

           public void sendMessage(String message) {
                System.out.println("sendMessage using email from EmailService");
            }
            static void m1(){

            }

            Exception add(byte b1, byte b2) {
                return null;
            }
        }

        class WhatsAppService extends MessageService {

            @Override
            public void sendMessage(String message) {
                System.out.println("sendMessage using whatsapp from WhatsAppService");
            }
        }
    }
}
