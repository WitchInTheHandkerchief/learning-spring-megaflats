package com.example.megaflats.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class CustomException extends RuntimeException {
    public CustomException(String exception){
        super(exception);
    }
}
