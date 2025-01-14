package array;

public class Demo16IsArrayContainsAlphabets {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'f', 'g', 'f', 't', 'z'};
        boolean isAlphabets = false;
        for (char temp : array) {
            if ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z')) {
                isAlphabets = true;
                break;
            }
        }
        System.out.println(isAlphabets ? "contains alphabets" : "does not contain alphabets");

    }
}
