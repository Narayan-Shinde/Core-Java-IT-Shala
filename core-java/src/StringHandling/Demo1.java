package StringHandling;

public class Demo1 {
    public static void main(String[] args) {
        String str1 = new String("abc");// 2
        String str2 = new String("pqr");//2
        String str3 = "abc";//0

        System.out.println("hashcode defined by string class");
        System.out.println(str1.hashCode());//same as hashCode is overriden
        System.out.println(str3.hashCode());//same as hashCode is overridden

        System.out.println("hashcode based on memory address");
        System.out.println(System.identityHashCode(str1));//heap
        System.out.println(System.identityHashCode(str3));//scp
    }
}
