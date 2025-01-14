package multithreading.threadCreation;

public class Demo7 {
    public static void main(String[] args) {
        //step 1 : create the subclass of type Runnable
        //step 2: object creation of subclass
        //step 3 : object creation of Thread class by passing runnable type object
        //step 4 : call the start method
        new Thread(
                () ->
                        System.out.println("run method using lambda expression way")
        )
                .start();


    }
}
