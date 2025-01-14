package StringHandling;

import java.util.Arrays;

public class Demo15Anagram {
    public static void main(String[] args) {
        String str1 = "bat";
        String str2 = "abt";
        //anagram : characters of one string are present in another string
        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();
        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            System.out.println(Arrays.equals(charArray1, charArray2) ? "anagram" : "not an anagram");
        } else {
            System.out.println("not an anagram");
        }
    }
}
