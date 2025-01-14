package array;

public class Demo11LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 40, 50, 15, 78};
        int x = 15;
        //find whether x is present inside the array or not

        //time complexity - unit to measure the time taken to complete a task
        // best case
        //worst case
        //big o notation
        //eg. o(1), o(n), o(n2),nlogn,
        //linear search - TC - o(n)
        //sequential search
        boolean isFound = false;
       /* for (int index = 0; index < array.length; index++) {
            if (x == array[index]) {
                isFound = true;
                break;
            }
        }*/

        for (int temp : array) {
            if (temp == x) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound ? "found" : "not found");


    }
}
