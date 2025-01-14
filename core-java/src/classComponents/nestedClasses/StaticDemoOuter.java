package classComponents.nestedClasses;

public class StaticDemoOuter {
    static int staticVariableOuter = 100;

    static void staticMethodOuter() {
        System.out.println("static method outer class");
    }

    static class StaticNested {
        int instanceVariable = 10;
        static int staticVariable = 20;

        void instanceMethod() {
            System.out.println("static nested class instance method");
        }

        static void staticMethod() {
            System.out.println("static nested class static method");
        }
    }
}
