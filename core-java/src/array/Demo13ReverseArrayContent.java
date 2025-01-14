package array;

public class Demo13ReverseArrayContent {
    public static void main(String[] args) {
        int[] array = {10, 40, 50, 65, 78, 56, 7};

        //10,40,50,65,78,65,7
        System.out.println("Before reverse");
        for (int temp : array) {
            System.out.print(temp + ", ");
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        //7, 65, 78, 65, 50, 40, 10
        System.out.println("\nAfter reverse");
        for (int temp : array) {
            System.out.print(temp + ", ");
        }
    }
}
