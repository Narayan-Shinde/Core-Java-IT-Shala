package classComponents.variables;

public class Product {
    int productId = 1;
    String productName = "laptop";
    int productPrice = 200;

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        System.out.println(product1.productId+" "+product1.productName+" "+product1.productPrice);
        System.out.println(product2.productId+" "+product2.productName+" "+product2.productPrice);

    }
}
