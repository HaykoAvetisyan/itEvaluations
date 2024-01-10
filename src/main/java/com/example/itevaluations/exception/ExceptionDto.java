package com.example.itevaluations.exception;

import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.time.Instant;
import java.util.List;

@Builder
public record ExceptionDto(
        Instant timestamp,
        int code,
        String type,
        String message,
        List<String> errors) {

    public ExceptionDto {
        timestamp = Instant.now();
    }

    public static ExceptionDto buildExceptionDto(Throwable ex, HttpStatus status) {
        return ExceptionDto.builder()
                .code(status.value())
                .type(ex.getClass().getCanonicalName())
                .message(ex.getMessage())
                .build();
    }

}
