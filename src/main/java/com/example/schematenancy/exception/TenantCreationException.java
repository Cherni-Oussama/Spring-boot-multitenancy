package com.example.schematenancy.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class TenantCreationException extends RuntimeException {

    private final HttpStatus httpStatus;
    private final String error;
    private final String errorDescription;


    public TenantCreationException(String error, String errorDescription, String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
        this.error = error;
        this.errorDescription = errorDescription;
    }

}
