package array;

public class Demo17IsCharArrayEmpty {
    public static void main(String[] args) {
        //good morning
        char[] array = {'a', 'b', 'f', 'g', 'f', 't', 'z'};
        boolean isEmpty = false;
        if (array == null || array.length == 0) {
            isEmpty = true;
        }
        System.out.println(isEmpty ? "array is empty" : "not empty");


    }

}
