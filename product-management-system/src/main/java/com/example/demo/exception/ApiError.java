package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;


@Data
public class ApiError {

    private Integer status;

    private String message;

    private LocalDateTime time;

    private Map<String,String> errors;


    public ApiError(int status, String message, Map<String, String> errors) {
        this.status = status;
        this.message = message;
        this.time= LocalDateTime.now();
        this.errors = errors;
    }
}
