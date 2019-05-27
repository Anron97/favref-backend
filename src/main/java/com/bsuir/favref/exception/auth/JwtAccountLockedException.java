package com.bsuir.favref.exception.auth;

/**
 * @author v.shakarov
 * @version 1.0
 */
public class JwtAccountLockedException extends RuntimeException {
    public JwtAccountLockedException() {
    }

    public JwtAccountLockedException(String message) {
        super(message);
    }

    public JwtAccountLockedException(String message, Throwable cause) {
        super(message, cause);
    }

    public JwtAccountLockedException(Throwable cause) {
        super(cause);
    }

    public JwtAccountLockedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
