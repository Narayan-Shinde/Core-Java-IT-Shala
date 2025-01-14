package StringHandling;

public class Demo6Methods {
    public static void main(String[] args) {
        String courses = "Java,Python,Data Analytics,React,DevOps";
        //split
        String[] splitStrings = courses.split(",");
        for (String course : splitStrings) {
            System.out.println(course);
        }
        String str = "         ";
        String str2 = null;
        //blank : Returns true if the string is empty or contains only white space codepoints, otherwise false.
        System.out.println("Is String blank : " + str.isBlank());


        //length==0 --> true else false
        System.out.println("Is String empty : " + str.isEmpty());

        //search
        System.out.println(courses.contains("Java"));//true

        String str7 = "Abc";
        System.out.println(str7.codePointAt(0));//65

        System.out.println("character array");
        char[] charArray = str7.toCharArray();
        for (int index = 0; index < charArray.length; index++) {
            System.out.print(charArray[index] + " ");
        }

        //reverse() method is not there in String class
        System.out.println("reversing the string");
        String string = "good morning online. Badla liya jayega";
        //string.reverse();

        String reverseString = "";
        for (int index = string.length() - 1; index >= 0; index--) {
            reverseString = reverseString + string.charAt(index);
        }
        System.out.println(reverseString);

        //
    }
}
