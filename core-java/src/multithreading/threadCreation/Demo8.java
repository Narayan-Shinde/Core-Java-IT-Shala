package multithreading.threadCreation;

public class Demo8 {
    public static void main(String[] args) {
        //even thread
        //step 1 : create a subclass of type Runnable
        class Even implements Runnable {
            @Override
            public void run() {
                for (int i = 2; i <= 100; i += 2) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                }
            }
        }

        //step 2 : create an object of subclass
        Runnable runnable = new Even();

        //step 3 : create a Thread class object by passing runnable type
        Thread thread = new Thread(runnable);

        //step 4 : call the start method
        thread.start();
    }
}
