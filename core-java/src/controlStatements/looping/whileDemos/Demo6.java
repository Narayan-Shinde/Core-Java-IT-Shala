package controlStatements.looping.whileDemos;

public class Demo6 {
    public static void main(String[] args) {
        int number = 456;
        while (number > 0) {
            System.out.println(number);
            number = number / 10;
        }
        //456
        //45
        //4
    }
}
