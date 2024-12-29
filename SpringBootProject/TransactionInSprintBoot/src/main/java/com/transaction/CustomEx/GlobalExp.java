package com.transaction.CustomEx;

import com.transaction.CustomEx.CustomEx;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;

@RestControllerAdvice
public class GlobalExp {

    @ExceptionHandler(value = UserDefineExp.class)
    public ResponseEntity<CustomEx> customEx(Exception e) {
        CustomEx customEx = new CustomEx(101, e.getMessage(), LocalDate.now());
        return new ResponseEntity<>(customEx, HttpStatus.BAD_REQUEST);

    }


}
