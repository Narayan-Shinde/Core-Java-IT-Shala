package objectClassMethods;

public class Demo6 {
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


        }
        Product product1 = new Product(1, "Laptop", 999999);
        Product product2 = new Product(1, "Laptop", 999999);
        Product product3 = new Product(1, "Laptop", 999999);

        System.out.println(product1 == product2);//false
        System.out.println(product1 == product3);//false
        System.out.println(product2 == product3);//false

        System.out.println("equals method from Object class");
        System.out.println(product1.equals(product2));//false
        System.out.println(product1.equals(product3));//false
        System.out.println(product2.equals(product3));//false
    }
}
