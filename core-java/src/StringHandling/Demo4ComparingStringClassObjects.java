package StringHandling;

public class Demo4ComparingStringClassObjects {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        System.out.println("**************by using == ****************");
        System.out.println(str1 == str2);//true : both are pointing to one object in SCP
        System.out.println(str1 == str3);//false : str1-->scp and str3-->heap
        System.out.println(str2 == str3);//false : str2-->scp and str3-->heap

        System.out.println("**************by using equals() method ****************");
        System.out.println(str1.equals(str2));//true : content check happens and not the reference check since equals is overridden
        System.out.println(str1.equals(str3));//true : content check happens and not the reference check since equals is overridden
        System.out.println(str2.equals(str3));//true : content check happens and not the reference check since equals is overridden

        System.out.println("**************by using compareTo() method ****************");
        System.out.println(str1.compareTo(str2));//0 --> compareTo returns integer value[+,-, 0]
        System.out.println(str1.compareTo(str3));//0
        System.out.println(str2.compareTo(str3));//0

        /*
        compareTo method returns
        0 --> if both the string content is same
        +positive --> when the first object is bigger than the second one based on asccii value
        _ negative --> when the first object is smaller than the second one based on asccii value

        */
        String str4 = "Z";
        String str5 = "C";
        System.out.println(str4.compareTo(str5));//0

        // compareTo method compares the String objects lexicographically.
    }
}
