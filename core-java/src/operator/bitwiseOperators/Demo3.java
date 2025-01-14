package operator.bitwiseOperators;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Bitwise XOR Operation");
        System.out.println(4 ^ 5); //1
        System.out.println(3 ^ 2); //1
        System.out.println(6 ^ 8); // 0 1 1 0
                                    //1 0 0 0
                                    //1 1 1 0 --> 14
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ false);//false
        System.out.println(false ^ true);//true
        //System.out.println(1 ^ true);//CTE
        System.out.println(10 % 2 == 0 ^ 10 % 0 == 0);//AE
    }
}
