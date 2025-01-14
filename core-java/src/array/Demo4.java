package array;

public class Demo4 {
    public static void main(String[] args) {
        //index - how far the element is from the base address
        //index range = 0 to 4
        int[] array = {10, 5, 11, 23, 45};

        //it will call toString method of Object class
        // it will print hexa -decimal hashcode
        System.out.println(array);
        System.out.println("Hashcode "+array.hashCode());

        //we can access the array elements using the concept of index
        System.out.println(array[0]);//10
        System.out.println(array[1]);//5
        System.out.println(array[2]);//11
        System.out.println(array[3]);//23
        System.out.println(array[4]);//45
        System.out.println(array[5]);//ArrayIndexOutOfBoundsException
    }
}
