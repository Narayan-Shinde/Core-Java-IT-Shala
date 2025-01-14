package java8Features;

import java.util.List;

public class Demo13ConstructorReference {
    public static void main(String[] args) {
        class B {
            B() {
                System.out.println("Class B constructor");
            }

            void m2() {
                System.out.println("class B instance method");
            }

            static void m3() {
                System.out.println("class b static method");
            }
        }

        interface A {
            void m1();
        }

        A a1 = () -> System.out.println("test");
        a1.m1();

        //constructor reference
        A a2 = B::new;
        a2.m1();

        //instance method reference
        B b = new B();
        A a3 = b::m2;
        a3.m1();

        //static method reference
        A a4 = B::m3;
        a4.m1();


        interface I2 {
            void accept(String str);
        }

        I2 i = (str) -> System.out.println(str);
        i.accept("good morning");

        I2 i2 = System.out::println;
        i2.accept("good afternoon");

        List<Integer> list = List.of(10, 20, 30, 405);
        for (int temp : list) {
            System.out.println(temp);
        }
        System.out.println("using java 8");
        list.forEach(System.out::println);

    }
}
