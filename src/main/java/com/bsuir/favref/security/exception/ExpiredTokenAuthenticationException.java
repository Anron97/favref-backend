package com.bsuir.favref.security.exception;

import javax.naming.AuthenticationException;

/**
 * @author a.shakarov
 * @version 1.0
 */
public class ExpiredTokenAuthenticationException extends AuthenticationException {

    public ExpiredTokenAuthenticationException() {
        super("Authentication token is expired.");
    }
}
