package controlStatements.looping.forDemos.patterns;

public class Demo5 {
    /*

     1
     1 0
     1 0 1
     1 0 1 0
     1 0 1 0 1

     * */
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print((col % 2 == 0 ? "0" : "1") + " ");
            }
            System.out.println();
        }
    }
}
