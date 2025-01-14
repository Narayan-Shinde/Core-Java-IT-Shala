package classComponents.variables;

public class Demo4 {
    int x;//iv
    int y;//iv
    static int z;//sv
    static int p;//sv

    public static void main(String[] args) {
        int x = 10;//lv
        int y = 20;//lv
        int z = 30;//lv
        int p = 100;
        System.out.println("local variable "+x);//10
        System.out.println("local variable "+y);//20
        System.out.println("local variable "+z);//30
        System.out.println("static variable "+Demo4.z);//0
        System.out.println("static variable "+p);//0

        Demo4 ref = new Demo4();
        System.out.println("instance variable "+ref.x);//0
        System.out.println("instance variable "+ref.y);//0


    }
}
