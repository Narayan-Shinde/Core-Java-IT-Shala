package wrapperClasses;

public class Demo1 {
    public static void main(String[] args) {
        //wrapper classes : Byte, Short, Integer, Long, Float, Double, Character, Boolean
        //predefined classes present in package : java.lang
        // all of these are immutable classes
        byte primitiveValue = 100;
        Byte wrapperClass = primitiveValue;//auto-boxing
        Byte wrapperClass1 = Byte.valueOf(primitiveValue);//auto-boxing
        byte parsedByte = Byte.parseByte("123");
        System.out.println(parsedByte);


    }
}
