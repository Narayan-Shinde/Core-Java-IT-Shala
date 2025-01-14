package multithreading.threadCreation;

public class Demo3 {
    public static void main(String[] args) {
        //even odd number
        Thread even = new Thread() {
            @Override
            public void run() {
                for (int i = 2; i <= 100; i += 2) {
                    System.out.println(Thread.currentThread().getName() + "\t" + i);
                }
            }
        };
        even.setName("even");

        Thread odd = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i += 2) {
                    System.out.println(Thread.currentThread().getName() + "\t" + i);
                }
            }
        };
        odd.setName("odd");
        even.start();
        odd.start();
    }
}
