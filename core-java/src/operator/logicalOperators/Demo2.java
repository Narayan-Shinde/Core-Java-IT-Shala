package operator.logicalOperators;

public class Demo2 {
    public static void main(String[] args) {
        //short circuit
        //Logical AND will return false immediately when the first operand is false, and it won't solve rest of the expression
        System.out.println(10 % 2 == 1 && 10 % 0 == 0);//false

        System.out.println(10 % 2 == 0 || 10 % 0 == 0);//true

        int year = 2025;
        System.out.println("leap check");
        System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));//false
    }
}
