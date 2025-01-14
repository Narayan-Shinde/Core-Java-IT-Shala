package classComponents.nestedClasses;

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        System.out.println("outer class sv "+StaticDemoOuter.staticVariableOuter);
        StaticDemoOuter.staticMethodOuter();

        System.out.println("static nested class sv "+StaticDemoOuter.StaticNested.staticVariable);
        StaticDemoOuter.StaticNested.staticMethod();

        //accessing the instance members of static nested class

        StaticDemoOuter.StaticNested ref = new StaticDemoOuter.StaticNested();
        System.out.println("static nested class iv "+ref.instanceVariable);
        ref.instanceMethod();

    }
}
