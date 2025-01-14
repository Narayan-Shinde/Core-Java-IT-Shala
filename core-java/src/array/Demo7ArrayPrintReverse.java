package array;

public class Demo7ArrayPrintReverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 90, 32};
        //asc
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        //rev
        System.out.println("printing in reverse order : ");
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + " ");
        }
    }
}
