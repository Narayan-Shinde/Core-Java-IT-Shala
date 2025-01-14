package multithreading.basics;

public class Demo3 {
    public static void main(String[] args) {
        //1. traditional way  to create subclass of Runnable
        class RunnableImpl implements Runnable {
            @Override
            public void run() {
                System.out.println("run method overridden using traditional way");
            }
        }
        Runnable runnable1 = new RunnableImpl();
        runnable1.run();

        //2. anonymous class way  to create subclass of Runnable
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run method overridden using anonymous class way");
            }
        };
        runnable2.run();


        //3. Lambda expression way  to create subclass of Runnable
        Runnable runnable3 = () -> System.out.println("run method overridden using lambda expression way");
        runnable3.run();
    }
}
