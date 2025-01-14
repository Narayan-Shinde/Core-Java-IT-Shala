package java8Features;

public class Demo11FunctionDemo {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Function<T, R> {
            R apply(T t);
        }

        Function<String, Integer> function = str ->{ return  str.length();};
        System.out.println("String length is "+function.apply("IT Shaala"));

        Function<Integer, Integer> square = number -> number * number;
        System.out.println(square.apply(10));//100


        //method reference
        Function<String, Integer> ref = String::length;
        System.out.println(ref.apply("good morning"));


    }
}
