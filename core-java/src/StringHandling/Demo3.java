package StringHandling;

public class Demo3 {
    public static void main(String[] args) {
        String str = "good morning";
        System.out.println(str);//good morning --> since toString is overridden
        System.out.println(str.toString());//good morning --> since toString is overridden
    }
}
