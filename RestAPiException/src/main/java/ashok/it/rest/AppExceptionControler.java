package ashok.it.rest;


import ashok.it.exception.ExInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;

@RestControllerAdvice
public class AppExceptionControler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ExInfo> exHandle(Exception e){

        ExInfo info = new ExInfo("Ex101",e.getMessage(), LocalDate.now());

        return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(value = ProductExceptionHandler.class)
    public ResponseEntity<ExInfo> productHandle(Exception e){

        ExInfo info = new ExInfo("Ex101",e.getMessage(), LocalDate.now());

        return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
    }
}
