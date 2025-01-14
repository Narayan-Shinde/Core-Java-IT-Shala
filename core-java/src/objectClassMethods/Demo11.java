package objectClassMethods;

public class Demo11 {
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
            public String toString() {
                return "Product{" +
                        "productId=" + productId +
                        ", productName='" + productName + '\'' +
                        ", productPrice=" + productPrice +
                        '}';
            }
        }

        Product product = new Product(1,"mobile",80000);
        System.out.println(product);
        System.out.println(product.toString());
    }
}
