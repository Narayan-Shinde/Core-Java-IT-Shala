package controlStatements.looping.forDemos.patterns;

public class Demo9 {
    public static void main(String[] args) {
        /*
                *
              * *
            * * *
          * * * *
        * * * * *

        * */
        for (int row = 1; row <=5 ; row++) {
            //space
            for (int space = 1; space <=5-row ; space++) {
                System.out.print(" ");
            }
            //star
            for (int star = 1; star <=row ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
