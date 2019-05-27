package com.bsuir.favref.exception.registration;

/**
 * @author a.shakarov
 * @version 1.0
 */
public class RegistrationDataSavingException extends RuntimeException {
    public RegistrationDataSavingException() {
        super();
    }

    public RegistrationDataSavingException(String message) {
        super(message);
    }

    public RegistrationDataSavingException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegistrationDataSavingException(Throwable cause) {
        super(cause);
    }

    protected RegistrationDataSavingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
