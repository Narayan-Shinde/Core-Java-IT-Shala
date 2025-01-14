package array;

public class Demo6ArrayElementSum {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 90, 32};
        int sum = 0;
        //enhanced for loop
        for (int temp : array) {
            //sum = sum + temp;
            sum += temp;
        }
        System.out.println("Array sum using enhanced for loop : " + sum);
        sum = 0;
        //traditional for loop
        for (int index = 0; index < array.length; index++) {
//            sum = sum + array[index];
            sum += array[index];
        }
        System.out.println("Array sum using traditional for loop : " + sum);
    }
}
