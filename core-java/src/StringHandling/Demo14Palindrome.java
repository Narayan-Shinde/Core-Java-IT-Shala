package StringHandling;

public class Demo14Palindrome {
    public static void main(String[] args) {
        String str = "nayan";
        System.out.println(
                new StringBuilder(str)
                        .reverse()
                        .toString()
                        .equals(str)
                        ? "palindrome" : "not a palindrome");
    }
}
