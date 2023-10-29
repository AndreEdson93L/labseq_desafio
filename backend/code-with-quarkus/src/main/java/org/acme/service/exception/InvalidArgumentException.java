package org.acme.service.exception;

public class InvalidArgumentException extends RuntimeException {

    public InvalidArgumentException(String message) {
        super(message);
    }
}
