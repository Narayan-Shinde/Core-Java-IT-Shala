package multithreading.threadExecutionPreventation;

public class Demo5Yield {
    public static void main(String[] args) {
        Thread even = new Thread(() -> System.out.println("Even"), "even");
        Thread odd = new Thread(() -> System.out.println("odd"), "odd");
        odd.setDaemon(true);
        even.start();
        odd.start();
        System.out.println("is daemon " + odd.isDaemon());
        Thread.yield();

        System.out.println("main thread");
    }
}
