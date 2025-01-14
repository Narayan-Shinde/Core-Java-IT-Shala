package multithreading.threadExecutionPreventation;

public class Demo4Join {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> {
            System.out.println("custom custom");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        };
        Thread custom = new Thread(runnable, "custom");

        custom.start();
        custom.join(500000000);


        System.out.println("main thread");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }

    }
}
