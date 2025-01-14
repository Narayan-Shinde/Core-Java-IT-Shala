package array;

public class Demo22 {
    public static void main(String[] args) {
        int[][] array1 = {};
        int[][] array2 = {{}};
        int[][] array3 = {{}, {}};

        System.out.println("array 1: " + array1.length);//0
        System.out.println("array 2: " + array2.length);//1
        System.out.println("array 2 inner array : " + array2[0].length);//0
        System.out.println("array 3: " + array3.length);//2
        System.out.println("array 3 inner array : " + array3[0].length);//0
        System.out.println("array 3 inner array : " + array3[1].length);//0
    }
}
