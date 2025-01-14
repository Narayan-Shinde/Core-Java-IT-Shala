package controlStatements.looping.whileDemos;

public class Demo4 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        while (left < right) {
            System.out.println(left + "\t" + right);
            left++;
        }
        //0 10
        //1 10
        //2 10
        //...
        //9 10
    }
}
