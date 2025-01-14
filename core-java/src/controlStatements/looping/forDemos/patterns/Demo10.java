package controlStatements.looping.forDemos.patterns;

public class Demo10 {
    public static void main(String[] args) {
        /*
                1
              1 2
            1 2 3
          1 2 3 4
        1 2 3 4 5
        * */
        for (int row = 1; row <= 5; row++) {
            //spaces
            for (int space = 1; space <=5-row ; space++) {
                System.out.print(" ");
            }
            //values
            for (int value = 1; value <=row ; value++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
