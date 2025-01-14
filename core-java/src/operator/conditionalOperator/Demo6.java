package operator.conditionalOperator;

public class Demo6 {
    public static void main(String[] args) {
        int year = 2024;
        System.out.println(
                year%400==0 ||
                        (year%4==0 && year%100!=0)
        );//true
    }
}
