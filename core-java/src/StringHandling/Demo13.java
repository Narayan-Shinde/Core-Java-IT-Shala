package StringHandling;

import java.util.StringJoiner;

public class Demo13 {
    public static void main(String[] args) {
        String str = new String("abc");
        System.out.println("memory address based hashcode : heap --> "+System.identityHashCode(str));
        System.out.println("memory address based hashcode : scp --> "+System.identityHashCode(str.intern()));

        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("abc");
        stringJoiner.add("abc");
        stringJoiner.add("abc");
        stringJoiner.add("abc");
        System.out.println(stringJoiner);

        String str2 = "abc";
        byte[] bytes = str2.getBytes();

        //wrapper classes
        //parseInt
        //valueOf

    }
}
