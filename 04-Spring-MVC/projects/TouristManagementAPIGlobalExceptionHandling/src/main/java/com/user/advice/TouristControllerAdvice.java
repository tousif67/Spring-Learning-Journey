package com.user.advice;

import com.user.exceptions.TouristNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class TouristControllerAdvice {

    @ExceptionHandler(TouristNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleTouristException(TouristNotFoundException tnf) {
           ErrorDetails err = new ErrorDetails("404 not found", tnf.getMessage(), LocalDateTime.now());
            return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleTouristException(Exception e) {
        ErrorDetails err = new ErrorDetails("Internal Server Error", e.getMessage(), LocalDateTime.now());
        return new ResponseEntity<ErrorDetails>(err, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
