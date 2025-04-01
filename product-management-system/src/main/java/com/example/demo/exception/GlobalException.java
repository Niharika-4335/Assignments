package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {
//    @ExceptionHandler(ProductNotFoundException.class)
//    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException productNotFoundException){
//        return new ResponseEntity<>(productNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handleGlobalException(Exception exception){
//        return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_REQUEST);
//    }
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
//        Map<String, String> errors = new HashMap<>();
//
//        // Iterate over all validation errors using a for-loop
//        for (Object error : ex.getBindingResult().getAllErrors()) {
//            FieldError fieldError = (FieldError) error;
//            String fieldName = fieldError.getField();
//            String message = fieldError.getDefaultMessage();
//            errors.put(fieldName, message);
//        }
//
//        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//    }



    //without writing like this as we created a class we can generate like that

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ApiError> handleProductNotFoundException(ProductNotFoundException productNotFoundException){

        ApiError apiError=new ApiError(HttpStatus.NOT_FOUND.value(),productNotFoundException.getMessage(),null);

        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        // Iterate over all validation errors using a for-loop
        for (Object error : ex.getBindingResult().getAllErrors()) {
            FieldError fieldError = (FieldError) error;
            String fieldName = fieldError.getField();
            String message = fieldError.getDefaultMessage();
            errors.put(fieldName, message);
        }
        ApiError apiError = new ApiError(
                HttpStatus.BAD_REQUEST.value(),
                "Validation failed",
                errors
        );
//      return  ResponseEntity.status(HttpStatus.BAD_REQUEST)
//              .contentType(MediaType.APPLICATION_JSON)  // Ensure JSON output
//              .body(apiError);

        return  new ResponseEntity<>(apiError,HttpStatus.BAD_REQUEST);
    }






}
