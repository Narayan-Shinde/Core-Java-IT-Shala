package classComponents.blocks;

public class Demo1 {
    //instance block
    {
        System.out.println("instance block 1");
    }
    {
        System.out.println("instance block 2");
    }

    //static block
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Demo1  demo1 = new Demo1();
        Demo1  demo2 = new Demo1();
    }
    //java Demo1
}
