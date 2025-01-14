package controlStatements.looping.forDemos;

public class Demo15 {
    public static void main(String[] args) {
        for (int left = 0, right = 10; left < right; right--) {
            System.out.println(left + "\t" + right);
        }
        //10 times
        //0 10
        //0 9
        //0 8
        //...
        //0 1
    }
}
