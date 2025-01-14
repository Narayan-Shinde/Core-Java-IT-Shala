package array;

public class Demo21 {
    public static void main(String[] args) {
        // when values are known
        int[] array = {1, 3, 4, 5};

        //jagged array
        int[][] arrayOfArray = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 12, 13}
        };


        //when values are not known
        int[][] arrayOfArray2 = new int[5][3];
         /*
         {
            {0,0,0},
            {0,0,0},
            {0,0,0},
            {0,0,0},
            {0,0,0}
         }

         */
    }
}
