package oops.abstraction;

public class Demo11 {
    public static void main(String[] args) {

        //Functional interface : contains single abstract method --> SAM
        //annotate interface with @FunctionalInterface

        @FunctionalInterface
        interface NotificationService {
            void sendNotification();
            static void m1(){}
            static void m2(){}
            default void m3(){}
            default void m4(){}
        }

        class NotificationServiceImpl implements NotificationService {
            public void sendNotification() {
                System.out.println("NotificationServiceImpl.sendNotification()");
            }
        }

        NotificationService notificationService = new NotificationServiceImpl();
        notificationService.sendNotification();


    }
}
