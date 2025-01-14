package array;

public class Demo25 {
    public static void main(String[] args) {
        int[][] arrayOfArray = {
                {1, 2, 3},
                {1, 2, 3, 4},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5, 6},
        };
        for (int[] tempArray : arrayOfArray) {
            for (int temp : tempArray) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
