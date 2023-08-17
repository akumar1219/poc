package com.tutorial.poc.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseEntity<Object> getCustomMessage(Exception e, WebRequest request) throws Exception {
        return handleExceptionInternal(e, "Very Bad data", new HttpHeaders(), HttpStatus.BAD_REQUEST, request);

    }



    @ExceptionHandler
    @ResponseBody
    public String getNullPointer(NullPointerException e){
        return "Hey There is an null pointer error ";

    }
}
