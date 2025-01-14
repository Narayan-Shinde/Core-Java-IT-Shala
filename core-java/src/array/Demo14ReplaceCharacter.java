package array;

public class Demo14ReplaceCharacter {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'f', 'g', 'f', 't'};
        char oldChar = 'b';
        char replaceWith = 'B';
        for (int index = 0; index < array.length; index++) {
            if (array[index] == oldChar) {
                array[index] = replaceWith;
            }
        }
        System.out.println("after replacing");
        for (char temp : array) {
            System.out.print(temp + ", ");
        }
    }
}
