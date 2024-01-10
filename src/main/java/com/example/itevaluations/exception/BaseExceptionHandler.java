package com.example.itevaluations.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@Slf4j
@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = {UserNotFoundException.class})
    ResponseEntity<ExceptionDto> handleNoSuchElementException(final NoSuchElementException ex) {
        ExceptionDto exceptionDto = ExceptionDto.buildExceptionDto(ex,HttpStatus.NOT_FOUND);
        log.error(exceptionDto.toString());
        return new ResponseEntity<>(exceptionDto, HttpStatus.NOT_FOUND);
    }
}
