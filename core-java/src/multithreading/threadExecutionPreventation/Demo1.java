package multithreading.threadExecutionPreventation;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(5000);
            System.out.println(i);
        }
    }
}
