package controlStatements.transfer.breakDemos;

public class Demo6 {
    public static void main(String[] args) {
        //3, 5,7
        for (int i = 1; i <= 100; i++) {
            if (!(i % 3 == 0 || i % 5 == 0 || i % 7 == 0)) {
                System.out.println(i);
            }
        }
    }
}
