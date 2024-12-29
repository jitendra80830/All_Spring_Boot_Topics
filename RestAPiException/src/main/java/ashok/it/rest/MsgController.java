package ashok.it.rest;

import ashok.it.exception.ExInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class MsgController {

    @GetMapping("/welcome")
    public String getMsg(){
        int i = 10/0;

        return "Welcome to Home";
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ExInfo> exHandle(Exception e){

        ExInfo info = new ExInfo("Ex101",e.getMessage(), LocalDate.now());

        return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
