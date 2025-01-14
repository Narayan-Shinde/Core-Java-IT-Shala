package controlStatements.looping.forDemos;

public class Demo14 {
    public static void main(String[] args) {
        for (int left = 0, right = 10; left < right; left++) {
            System.out.println(left + "\t" + right);
        }
        //10 times
        //0, 10
        //1 10
        //2 10
        //3 10
        //4 10
        //...
        //9 10
    }
}
