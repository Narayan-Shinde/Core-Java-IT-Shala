package multithreading.priority;

public class Demo1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("thread");
        });
        thread.setPriority(11);
        thread.start();
    }
}
