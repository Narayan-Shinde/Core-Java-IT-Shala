package userInput.commandLineArguments;

public class Demo2 {
    public static void main(String[] arrayOfString) {
        //string to integer conversion
        int number = Integer.parseInt(arrayOfString[0]);
        int number2 = Integer.parseInt(arrayOfString[1]);
        System.out.println("you have entered " + number + " number");
        System.out.println("you have entered " + number2 + " number");
    }
}
