package classComponents.thisKeyword;

public class Demo3 {
    int x = 1;
    int y = 2;
    static int z = 3;

    void m1() {
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println("local variable " + x);//10
        System.out.println("local variable " + y);//20
        System.out.println("local variable " + z);//30

        System.out.println("instance variable " + this.x);
        System.out.println("instance variable " + this.y);
        System.out.println("static variable " + this.z);
        System.out.println("static variable " + Demo3.z);
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.m1();
    }
}
