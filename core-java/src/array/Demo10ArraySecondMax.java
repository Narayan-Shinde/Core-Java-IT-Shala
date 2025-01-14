package array;

public class Demo10ArraySecondMax {
    public static void main(String[] args) {
        int[] array = {10, 30, 11, 56, 89, 13, 57, 83};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int temp : array) {
            if (temp > max) {
                secondMax = max;
                max = temp;
            }
            if (temp > secondMax && temp < max) {
                secondMax = temp;
            }
        }
        System.out.println("max : " + max);
        System.out.println("second max : " + secondMax);


        //output
        //max = 89
        //second max = 83
    }
}
