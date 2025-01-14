package exceptionHandling;

public class InvalidEmailException extends RuntimeException {

    InvalidEmailException() {
    }

    InvalidEmailException(String message) {
        super(message);
    }
}
