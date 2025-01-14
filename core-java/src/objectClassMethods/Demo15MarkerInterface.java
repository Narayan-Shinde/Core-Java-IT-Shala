package objectClassMethods;

import lombok.*;

public class Demo15MarkerInterface {
    public static void main(String[] args) throws CloneNotSupportedException {

        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        @Getter
        @Setter
        class Product implements Cloneable {
            private int id;
            private String name;
            private int price;

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        Product product1 = new Product(1, "Laptop", 100);
        Product product2 = product1;//this is not object cloning--> this is reference copy

        Product product3 = (Product) product1.clone();
        System.out.println(product1 + "\t" + product1.hashCode());
        System.out.println(product3 + "\t" + product3.hashCode());
    }
}
