package classComponents.thisKeyword;

public class Product {
    int id;
    String name;
    int price;

    //all args constr
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // no-args constructor
    public Product(){

    }

    //copy constructor --> parameterized constructor
    public Product(Product product) {
        this.id = product.id;
        this.name = product.name;
        this.price = product.price;
    }

    //lombok library --> encapsulation --> oops
    public static void main(String[] args) {
        Product product1 = new Product();//zero param
        Product product2 = new Product(1,"Mobile",499999);
        Product product3 = new Product(product2);
    }

}
