package array;

public class Demo8ArrayMaxElement {
    public static void main(String[] args) {
        int[] array = {100, 20, 30, 90, 32, 0, -123, 123};
        int maximum = Integer.MIN_VALUE;
        for (int temp : array) {
            if (temp > maximum) {
                maximum = temp;
            }
        }
        System.out.println("Array max element " + maximum);
        //output : 90
    }
}
