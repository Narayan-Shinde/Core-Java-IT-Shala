package java8Features;

import java.util.function.Supplier;

public class Demo10SupplierDemo {
    public static void main(String[] args) {
       /* @FunctionalInterface
        interface Supplier<X> {
            X get();
        }*/

        Supplier<String> supplier = () -> "string returned";
        Supplier<Integer> integerSupplier = () -> 1000;
        System.out.println(supplier.get());//string
        System.out.println(integerSupplier.get());//integer

    }
}
