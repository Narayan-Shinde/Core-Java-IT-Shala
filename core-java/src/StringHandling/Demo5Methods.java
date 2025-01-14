package StringHandling;

public class Demo5Methods {
    public static void main(String[] args) {
        String str = "IT Shaala";
        //length() --> returns integer value specifying the no. of characters
        //length --> variable associated with every array
        System.out.println("size of the String " + str.length());//9

        //charAt() : returns the character at specified index. index starts from 0
        //if the index is not there we get StringIndexOutOfBoundsException
        System.out.println(str.charAt(0));//I
        System.out.println(str.charAt(1));//T

        //concat() : it combines the String together
        str = str.concat(" Training Institute");
        System.out.println(str);// IT Shaala Training Institute

        //change the case
        String str2 = "Welcome to IT Shaala";
        str2 = str2.toUpperCase();
        System.out.println(str2);

        String str3 = "Full Stack Development Using Java and React";
        str3 = str3.toLowerCase();
        System.out.println(str3);


        str3 = str3.replace('a', '@');
        System.out.println(str3);

        String str4 = "Python master class";
        String substring = str4.substring(0, 3);
        System.out.println(substring);

        String str5 = "      Data analytics        ";
        str5 = str5.trim();
        System.out.println(str5);
        System.out.println(str5.indexOf('D'));//0

        String str6 = "ababab";
        System.out.println(str6.indexOf('a'));//0
        System.out.println(str6.lastIndexOf('a'));//4

        System.out.println(str6.startsWith("a"));//true
        System.out.println(str6.startsWith("x"));//false
        System.out.println(str6.endsWith("ab"));//true
        System.out.println(str6.startsWith("z"));//false

    }
}
