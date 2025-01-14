package StringHandling;

public class Demo10 {
    public static void main(String[] args) {
        String str = "welcome";
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(str);
        System.out.println(stringBuilder);

        String str2 = new String(stringBuilder);
        String str3 = new String(stringBuffer);
        System.out.println(str2);
        System.out.println(str3);

        // StringBuilder stringBuilder1 = "anc";
        //StringBuffer stringBuffer1 = "zyx";




    }
}
