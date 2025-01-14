package array;

public class Demo9ArrayMinimumElement {
    public static void main(String[] args) {
        int[] array = {100, 20, 30, 90, 32, 0, -123, 123};
        int minimum = Integer.MAX_VALUE;
        for (int temp : array) {
            if (temp < minimum) {
                minimum = temp;
            }
        }
        System.out.println("Array minimum element " + minimum);
        //output : -123
    }
}
