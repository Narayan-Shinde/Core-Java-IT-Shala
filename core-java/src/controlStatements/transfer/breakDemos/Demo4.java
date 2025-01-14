package controlStatements.transfer.breakDemos;

public class Demo4 {
    public static void main(String[] args) {
        int[] array = {10, 203, 40, 10};
        for (int temp : array) {
            System.out.println(temp);
            break;
        }
        //break;// : break cannot be used outside the loops or switch
    }
}
