package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ApiResponse {

    private String message;

    private LocalDateTime timestamp;

    private String description;

    public ApiResponse(String message, LocalDateTime timestamp, String description) {
        this.message = message;
        this.timestamp = timestamp;
        this.description = description;
    }
}
