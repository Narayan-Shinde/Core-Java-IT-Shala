package multithreading.threadCreation;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        class Worker extends Thread{
            @Override
            public void run() {
                System.out.println("run method");
                System.out.println(Thread.currentThread().getName());
                m1();
            }
        }
        Worker worker = new Worker();
        worker.start();
       // worker.run();
        System.out.println(10/0);
        System.out.println("rest of the main");
    }
    public static void m1(){
        System.out.println("m1 "+Thread.currentThread().getName());
        m2();
    }
    public static void m2(){
        System.out.println("m2 "+Thread.currentThread().getName());
    }
}
