package array;

public class Demo5 {
    public static void main(String[] args) {
        int[] array = {10, 5, 11, 23, 45};
        System.out.println("accessing the array elements one by one");
        System.out.println(array[0]);//10
        System.out.println(array[1]);//5
        System.out.println(array[2]);//11
        System.out.println(array[3]);//23
        System.out.println(array[4]);//45

        System.out.println("array length or size " + array.length);//5

        System.out.println("accessing the array elements using for loop");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        System.out.println("accessing the array elements using enhanced for loop");
        for (int temp : array) {
            System.out.println(temp);
        }


    }
}
