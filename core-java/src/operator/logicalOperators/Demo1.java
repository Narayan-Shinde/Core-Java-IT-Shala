package operator.logicalOperators;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Logical AND Operation");
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        //System.out.println(10 && 20);//CTE
        System.out.println((10 > 3) && (10 < 30));//true
        System.out.println(10 % 2 == 0 && 10 % 5 == 0);//true

        System.out.println("Logical OR Operation");
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        //System.out.println(10 || 20);//CTE
        System.out.println((10 > 3) || (10 > 30));//true
        System.out.println(10 % 2 == 0 || 10 % 5 == 1);//true

        System.out.println("logical not");
        System.out.println(!true);//false
        System.out.println(!false);//true
        System.out.println(!(10 > 30));
    }
}
