package java8Features;

public class Demo4SubclassesForFunctionalInterfaces {
    public static void main(String[] args) {

        @FunctionalInterface
        interface A {
            void m1();
        }

        //1. traditional way
        class B implements A {
            @Override
            public void m1() {
                System.out.println("traditional way m1");
            }
        }
        A traditional = new B();
        traditional.m1();

        //2. anonymous class way
        A anon = new A() {
            @Override
            public void m1() {
                System.out.println("anonymous way m1");
            }
        };
        anon.m1();

        //3. lambda expression way
        A lambda = () -> System.out.println("lambda way m1");
        lambda.m1();

        //4. method reference
    }
}
