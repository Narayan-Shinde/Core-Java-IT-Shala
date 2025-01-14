package controlStatements.decisionMaking.ifelseDemos;

public class Demo8 {
    public static void main(String[] args) {
        int monthNumber = 13;
       switch (monthNumber){
           case 1 -> System.out.println("January");
           case 2 -> System.out.println("Feb");
           case 3 -> System.out.println("Mar");
           case 4 -> System.out.println("Apr");
           case 5 -> System.out.println("May");
           case 6 -> System.out.println("Jun");
           case 7 -> System.out.println("Jul");
           case 8 -> System.out.println("Aug");
           case 9 -> System.out.println("Sep");
           case 10 -> System.out.println("Oct");
           case 11 -> System.out.println("Nov");
           case 12 -> System.out.println("Dec");
           default -> System.out.println("Invalid month number");
       }
    }
}
