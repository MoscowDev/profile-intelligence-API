package com.mxr.integration.exceptions;

public class PersonAlreadyExistsException extends RuntimeException {

    public PersonAlreadyExistsException() {
        super("Person already exists");
    }

}
