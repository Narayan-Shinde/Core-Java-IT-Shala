package controlStatements.decisionMaking.ifelseDemos;

public class Demo7 {
    public static void main(String[] args) {
        int monthNumber = 13;
        if (monthNumber == 1) {
            System.out.println("Jan " + monthNumber);
        }
        if (monthNumber == 2) {
            System.out.println("Feb " + monthNumber);
        }
        if (monthNumber == 3) {
            System.out.println("Mar " + monthNumber);
        }
        if (monthNumber == 4) {
            System.out.println("Apr " + monthNumber);
        }
        if (monthNumber == 5) {
            System.out.println("May " + monthNumber);
        }
        if (monthNumber == 6) {
            System.out.println("June " + monthNumber);
        }
        if (monthNumber == 7) {
            System.out.println("July " + monthNumber);
        }
        if (monthNumber == 8) {
            System.out.println("Aug " + monthNumber);
        }
        if (monthNumber == 9) {
            System.out.println("Sept " + monthNumber);
        }
        if (monthNumber == 10) {
            System.out.println("Oct " + monthNumber);
        }
        if (monthNumber == 11) {
            System.out.println("Nov " + monthNumber);
        }
        if (monthNumber == 12) {
            System.out.println("Dec " + monthNumber);
        }
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month");
        }
    }
}
