package controlStatements.decisionMaking.switchDemos;

public class Demo3 {
    public static void main(String[] args) {
        byte month = 2;
        String monthToPrint = switch (month) {
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "Sept";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "invalid month";
        };
        System.out.println(monthToPrint);
    }
}
