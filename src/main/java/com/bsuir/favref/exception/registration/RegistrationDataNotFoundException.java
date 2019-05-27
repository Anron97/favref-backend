package com.bsuir.favref.exception.registration;

/**
 * @author a.shakarov
 * @version 1.0
 */
public class RegistrationDataNotFoundException extends RuntimeException {
    public RegistrationDataNotFoundException() {
        super();
    }

    public RegistrationDataNotFoundException(String message) {
        super(message);
    }

    public RegistrationDataNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegistrationDataNotFoundException(Throwable cause) {
        super(cause);
    }

    protected RegistrationDataNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
