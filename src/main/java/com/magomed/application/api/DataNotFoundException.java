package com.magomed.application.api;


public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String message, Throwable e) {
        super(message, e);
    }

    public DataNotFoundException(String message) {
        super(message);
    }

}
