package operator.bitwiseOperators;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Bitwise OR Operation");
        System.out.println(4 | 5); //5
        System.out.println(3 | 2); //3
        System.out.println(6 | 8); //14
        System.out.println(true | true);//true
        System.out.println(true | false);//true
        System.out.println(false | false);//false
        System.out.println(false | true);//true
        //System.out.println(1 | true);//CTE
        System.out.println(10 % 2 == 0 || 10 % 0 == 0);//true --> short circuit
        System.out.println(10 % 2 == 0 | 10 % 0 == 0);//AE
    }
}
