package multithreading.threadCreation;

public class Demo4 {
    public static void main(String[] args) {
        //step 1 : create the subclass of type Runnable
        class Worker implements Runnable {
            @Override
            public void run() {
                System.out.println("run method using traditional way");
            }
        }

        //step 2: object creation of subclass
        Worker worker = new Worker();
        //worker.start();

        //step 3 : object creation of Thread class by passing runnable
        Thread thread = new Thread(worker);

        //step 4 : call the start method
        thread.start();


    }
}
