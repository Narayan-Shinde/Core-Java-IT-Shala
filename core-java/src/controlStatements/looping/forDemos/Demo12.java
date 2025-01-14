package controlStatements.looping.forDemos;

public class Demo12 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 500; i = i + 5) {
            System.out.println(i);
            count++;
        }
        System.out.println("Number iterations " + count);
        //81
    }
}
