package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException productNotFoundException){
        return new ResponseEntity<>(productNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(Exception exception){
        return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        // Iterate over all validation errors using a for-loop
        for (Object error : ex.getBindingResult().getAllErrors()) {
            FieldError fieldError = (FieldError) error;
            String fieldName = fieldError.getField();
            String message = fieldError.getDefaultMessage();
            errors.put(fieldName, message);
        }

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }


}
