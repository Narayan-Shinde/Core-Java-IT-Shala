package objectClassMethods;

public class Demo14Finalize {
    public static void main(String[] args) {
        class Product{
            int id;
            String name;

            @Override
            protected void finalize() throws Throwable {
                System.out.println("finalize method");
            }
        }
        Product product = new Product();
        product = null;

        //explicitly call the GC
        System.gc();
        System.out.println("rest of the main");

    }
}
