package org.example.Exception;

public class WrongChallengeException extends RuntimeException{
    private String message;

    public WrongChallengeException(String message) {
        this.message = message;
    }

    public WrongChallengeException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public WrongChallengeException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public WrongChallengeException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public WrongChallengeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message1;
    }
}
