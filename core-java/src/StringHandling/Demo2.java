package StringHandling;

public class Demo2 {
    public static void main(String[] args) {
        String str1 = new String("abc");//2
        String str2 = new String("abc");//1
        String str3 = new String("abc");//1
        String str4 = new String("abc");//1
        String str5 = new String("abc");//1
        String str6 = "abc";//0
        //total = 06 [5 in heap and 1 in scp]
        System.out.println(str1 == str2);//false
        System.out.println(str1 == str3);//false
        System.out.println(str1 == str3);//false
        System.out.println(str1 == str4);//false
        System.out.println(str1 == str5);//false
    }
}
