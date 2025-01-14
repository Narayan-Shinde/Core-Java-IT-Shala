package operator.concatenation;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println('A' + "A" + 'A');//AAA
        System.out.println('A' + 'A' + "A" + 'A');//130AA
        System.out.println("A" + 'A' + 'A');//AAA
        System.out.println('A' + "A" + 10 + 20);//AA1020
        char ch = 65;
        System.out.println(ch);//A

    }
}
