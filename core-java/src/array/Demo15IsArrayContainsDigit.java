package array;

public class Demo15IsArrayContainsDigit {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'f', 'g', 'f', 't', 'z'};
        boolean isDigit = false;
        for (char temp : array) {
            if (temp >= '0' && temp <= '9') {
                isDigit = true;
                break;
            }
        }
        System.out.println(isDigit ? "contains digit" : "does not contain digit");

    }
}
