package exceptionHandling;

import java.util.Scanner;

public class Demo22CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the email address");
        String email = scanner.next();
        try {
            System.out.println(emailValidation(email));
        } catch (InvalidEmailException invalidEmailException) {
            System.out.println("invalid email");
        }

    }

    private static boolean emailValidation(String email) throws InvalidEmailException {
        if (email.isBlank() || !email.contains("@") || !email.contains(".")) {
            throw new InvalidEmailException("Email is blank or invalid");
        }
        return true;
    }
}
