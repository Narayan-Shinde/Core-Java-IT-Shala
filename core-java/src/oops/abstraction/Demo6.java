package oops.abstraction;

public class Demo6 {
    public static void main(String[] args) {
        class Parent {
            int x = 1;
            int y = 2;
            int z = 3;
        }
        class Child extends Parent {
            int x = 10;
            int y = 20;
            int z = 30;

            void display() {
                int x = 100;
                int y = 200;
                int z = 300;
                System.out.println("Local variables "+x + " " + y + " " + z);//100, 200, 300
                System.out.println("Same class Instance variables "+this.x + " " + this.y + " " + this.z);//10 20 30
                System.out.println("Parent class instance variables "+super.x + " " + super.y + " " + super.z);//1 2 3
            }
        }

        Child child = new Child();
        System.out.println(child.x + " " + child.y + " " + child.z);
        //System.out.println(super.x + " " + super.y + " " + super.z);//super, this is not available in static context
        child.display();

    }
}
