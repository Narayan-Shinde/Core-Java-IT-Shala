package operator.arithmetic;

public class Demo5 {
    public static void main(String[] args) {
        int a = 10;
        // a = a + 10;
        a += 10; // shorthand arithmetic operator
        System.out.println(a);//20

        int b = 20;
        // b = b - 10;
        b -= 10;
        System.out.println(b);//10

        int c = 20;
        //c = c * 10; //200
        c *= 10;
        System.out.println(c);//200

        int d = 200;
//        d = d / 10; //20
        d /= 10;
        System.out.println(d);//20
    }
}
