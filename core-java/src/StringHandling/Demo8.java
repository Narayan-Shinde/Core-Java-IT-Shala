package StringHandling;

public class Demo8 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("string data");
        stringBuilder.insert(0, "at the beginning ");
        stringBuilder.delete(3,5);

        //append, insert, delete
        System.out.println(stringBuilder);

        String str = "kartik";
        StringBuilder stringBuilder2 = new StringBuilder(str);
        stringBuilder2.reverse();
        System.out.println(stringBuilder2);
    }
}
