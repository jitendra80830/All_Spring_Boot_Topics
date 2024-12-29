package ashok.in.CustomeExeption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppException {
    private Logger logger = LoggerFactory.getLogger(AppException.class);

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<BadAPIRequest> exp(Exception e){
        logger.info("Global Exceptions...");
        BadAPIRequest badAPIRequest = new BadAPIRequest("Something  is wrong.");
        return new ResponseEntity<>(badAPIRequest , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
