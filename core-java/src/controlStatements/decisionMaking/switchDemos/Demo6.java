package controlStatements.decisionMaking.switchDemos;

public class Demo6 {
    public static void main(String[] args) {

        String numberToPrint = switch (1) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "invalid number";
        };
        System.out.println(numberToPrint);
    }
}
