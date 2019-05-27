package com.bsuir.favref.exception.registration;

/**
 * @author a.shakarov
 * @version 1.0
 */
public class NewUserCreatingException extends RuntimeException {
    public NewUserCreatingException() {
        super();
    }

    public NewUserCreatingException(String message) {
        super(message);
    }

    public NewUserCreatingException(String message, Throwable cause) {
        super(message, cause);
    }

    public NewUserCreatingException(Throwable cause) {
        super(cause);
    }

    protected NewUserCreatingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
