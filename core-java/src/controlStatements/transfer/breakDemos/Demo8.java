package controlStatements.transfer.breakDemos;

public class Demo8 {
    public static void main(String[] args) {
        ///continue --> inside the loops otherwise CTE
        //keyword. jump statement or transfer statement

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("rest of  the main method");

    }
}
