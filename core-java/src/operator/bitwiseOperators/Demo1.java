package operator.bitwiseOperators;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Bitwise AND Operation");
        System.out.println(4 & 5); //4
        System.out.println(3 & 2); //2
        System.out.println(6 & 8); //0
        System.out.println(true & true);//true
        System.out.println(true & false);//false
        System.out.println(false & false);//false
        System.out.println(false & true);//false
        //System.out.println(1 & true);//CTE
        System.out.println(10 % 2 == 1 && 10 % 0 == 0);//false --> short circuit
        System.out.println(10 % 2 == 1 & 10 % 0 == 0);//AE
    }
}
