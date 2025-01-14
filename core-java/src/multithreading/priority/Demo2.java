package multithreading.priority;

public class Demo2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }, "1to10");
        Thread thread2 = new Thread(() -> {
            for (int i = 11; i <= 20; i++) {
                System.out.println(i);
            }
        }, "11to20");
        thread1.setPriority(1);
        thread2.setPriority(10);
        thread1.start();
        thread2.start();
        System.out.println("rest of main");
    }
}
