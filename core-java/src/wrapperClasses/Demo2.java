package wrapperClasses;

public class Demo2 {
    public static void main(String[] args) {
        String str = "123";
        // string into primitive type - parseXXX
        byte parsedByte = Byte.parseByte(str);
        System.out.println(parsedByte);

        // string into wrapper object type - valueOf
        Byte wrapperObject = Byte.valueOf(str);
        System.out.println(wrapperObject);
    }
}
