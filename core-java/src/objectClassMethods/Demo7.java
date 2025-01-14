package objectClassMethods;

import classComponents.blocks.Student;

import java.util.Objects;

public class Demo7 {
    public static void main(String[] args) {
        class Product {
            int productId;
            String productName;
            int productPrice;

            public Product(int productId, String productName, int productPrice) {
                this.productId = productId;
                this.productName = productName;
                this.productPrice = productPrice;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null || this.getClass() != obj.getClass()) return false;
                Product product = (Product) obj;
                return this.productId == product.productId;
            }

            @Override
            public int hashCode() {
                return Objects.hashCode(productId);
            }
        }
        Product product1 = new Product(1, "Laptop", 999999);
        Product product2 = new Product(1, "Laptop", 999999);
        Product product3 = new Product(1, "Laptop", 999999);

        System.out.println(product1 == product2);//false
        System.out.println(product1 == product3);//false
        System.out.println(product2 == product3);//false

        System.out.println("equals method from Product class");
        System.out.println(product1.equals(product1));//true
        System.out.println(product1.equals(null));//false
        System.out.println(product1.equals(new Student()));//false
        System.out.println(product1.equals(product2));//true
    }
}
