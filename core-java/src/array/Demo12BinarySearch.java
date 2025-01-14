package array;

import java.util.Arrays;

public class Demo12BinarySearch {
    public static void main(String[] args) {
        int[] array = {10, 40, 50, 65, 78};
        int x = -90;
        //find whether x is present inside the array or not
        //sorted data
        Arrays.sort(array);
        boolean isFound = false;
        int left = 0;
        int right = array.length - 1;
        int middle = (left + right) / 2;

        while (left <= right) {
            if (x == array[middle]) {
                isFound = true;
                break;
            }
            if (x > array[middle]) {
                left = middle + 1;
            }
            if (x < array[middle]) {
                right = middle - 1;
            }
            middle = (left + right) / 2;
        }
        System.out.println(isFound ? "found" : "not found");

    }
}
