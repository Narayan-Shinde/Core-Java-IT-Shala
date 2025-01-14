package java8Features;

public class Demo6RunnableImpl {
    public static void main(String[] args) {

        //1. traditional way
        class Worker implements Runnable {
            @Override
            public void run() {
                System.out.println("runnable traditional way");
            }
        }
        Runnable runnable = new Worker();
        runnable.run();


        //2. anonymous class way
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable implementation using anonymous class");
            }
        };
        anonymous.run();

        //3. lambda expression way
        Runnable lambda = () -> System.out.println("runnable implementation using lambda expression");
        lambda.run();
    }
}
