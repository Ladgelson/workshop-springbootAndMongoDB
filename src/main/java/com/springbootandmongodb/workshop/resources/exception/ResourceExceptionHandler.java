package com.springbootandmongodb.workshop.resources.exception;

import com.springbootandmongodb.workshop.services.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest req) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err =
                new StandardError(
                        System.currentTimeMillis(),
                        status.value(),
                        "Not found",
                        e.getMessage(),
                        req.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}