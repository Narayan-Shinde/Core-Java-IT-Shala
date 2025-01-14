package java8Features;

public class Demo3SubclassesForNormalInterfaces {
    public static void main(String[] args) {
        interface A{
            void m1();
            void m2();
        }
        //1. traditional way
        class B implements A{
            @Override
            public void m1() {
                System.out.println("child class B:m1");
            }

            @Override
            public void m2() {
                System.out.println("child class B : m2");
            }
        }
        A a = new B();
        a.m1();
        a.m2();


        //2. anonymous class way
        A anon = new A(){
            @Override
            public void m1() {
                System.out.println("child class anon:m1");
            }

            @Override
            public void m2() {
                System.out.println("child class anon : m2");
            }
        };
        anon.m1();
        anon.m2();

        // lambda expression and method reference are not applicable for normal interfaces
    }
}
