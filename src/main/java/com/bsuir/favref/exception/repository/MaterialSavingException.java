package com.bsuir.favref.exception.repository;

/**
 * @author a.shakarov
 * @version 1.0
 */
public class MaterialSavingException extends RuntimeException {
    public MaterialSavingException() {
    }

    public MaterialSavingException(String message) {
        super(message);
    }

    public MaterialSavingException(String message, Throwable cause) {
        super(message, cause);
    }

    public MaterialSavingException(Throwable cause) {
        super(cause);
    }

    public MaterialSavingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
