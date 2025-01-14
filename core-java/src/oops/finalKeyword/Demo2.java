package oops.finalKeyword;

public class Demo2 {
    public static void main(String[] args) {
        final int a = 100;
        //a = 200;//CTE --> final variable value cannot be reassigned.
        System.out.println(a);
    }
}
