package array;

public class Demo18ToUppercase {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'f', 'g', 'f', 't', 'z'};

        //to uppercase
        for (int index = 0; index < array.length; index++) {
            char temp = array[index];
            if (temp >= 'a' && temp <= 'z') {
                array[index] = (char) (array[index] - 32);
            }
        }
        for (char temp : array) {
            System.out.print(temp + " ");
        }
    }

}
