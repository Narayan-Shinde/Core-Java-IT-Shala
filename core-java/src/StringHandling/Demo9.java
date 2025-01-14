package StringHandling;

public class Demo9 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("string data");
        stringBuffer.insert(0, "at the beginning ");
        stringBuffer.delete(3,5);

        //append, insert, delete
        System.out.println(stringBuffer);

        String str = "kartik";
        StringBuffer stringBuffer1 = new StringBuffer(str);
        stringBuffer1.reverse();
        System.out.println(stringBuffer1);
    }
}
