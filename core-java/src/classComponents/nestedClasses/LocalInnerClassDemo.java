package classComponents.nestedClasses;

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        //local inner class

        class LocalInnerClass {
            int variable = 100;
            void method() {
                System.out.println("local inner class method");
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();

        System.out.println(localInnerClass.variable);
        localInnerClass.method();

    }
}
