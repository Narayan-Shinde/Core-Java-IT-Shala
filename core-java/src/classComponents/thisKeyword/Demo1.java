package classComponents.thisKeyword;

public class Demo1 {
    int a;

    void m1() {
        System.out.println(this.a);
    }

    public static void main(String[] args) {
     //   System.out.println(this.a);//CTE
        Demo1 ref = new Demo1();
        ref.m1();
        Demo1 ref2 = new Demo1();
        ref2.m1();
    }
}
