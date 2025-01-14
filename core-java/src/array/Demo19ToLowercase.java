package array;

public class Demo19ToLowercase {
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'F', 'g', 'f', 't', 'z'};

        //to uppercase
        for (int index = 0; index < array.length; index++) {
            char temp = array[index];
            if (temp >= 'A' && temp <= 'Z') {
                array[index] = (char) (array[index] + 32);
            }
        }
        for (char temp : array) {
            System.out.print(temp + " ");
        }
    }

}
