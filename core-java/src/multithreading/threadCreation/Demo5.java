package multithreading.threadCreation;

public class Demo5 {
    public static void main(String[] args) {
        //step 1 : create the subclass of type Runnable
        //step 2: object creation of subclass
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run method using anonymous way");
            }
        };

        //step 3 : object creation of Thread class by passing runnable type object
        Thread thread = new Thread(runnable);

        //step 4 : call the start method
        thread.start();


    }
}
