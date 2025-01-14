package classComponents.blocks;

public class Demo2 {
    static {
        System.out.println("Demo2 static block");
    }
    {
        System.out.println("Demo2 class instance block");
    }
    Demo2(){
        //1. constructor call check
        //2. instance block
        System.out.println("Demo2 zero param constructor block");
    }
    Demo2(int a){
        this();
        System.out.println("Demo2 parameterized constructor block");
    }

    public static void main(String[] args) {
        Demo2 obj = new Demo2(10);
    }

}
