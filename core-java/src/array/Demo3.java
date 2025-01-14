package array;

public class Demo3 {
    public static void main(String[] args) {
        //array size restriction
      //  int[] array1 = new int[10.05f];//Compile Time error -
        int[] array3 = new int[0];//no issue
        int[] array2 = new int[-5];//Runtime - NegativeArraySizeException

    }
}
