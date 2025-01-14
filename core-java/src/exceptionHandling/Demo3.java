package exceptionHandling;

public class Demo3 {
    public static void main(String[] args) {
        //OutOfMemoryError
        while (true){
           int[] array = new int[1000000];
        }
    }
}
