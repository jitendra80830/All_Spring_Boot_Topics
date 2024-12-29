package ashok.it.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class AppException {

    private Logger logger = LoggerFactory.getLogger(AppException.class);
    @ExceptionHandler(value = Exception.class)
    public String exHandler(Exception ex , Model model){

        //System.out.println("Global Exception method called.");
        logger.info("Global Exception method called.");
        model.addAttribute("erR" , ex.getMessage());
        model.addAttribute("date", LocalDateTime.now());

        return "error";
    }
}
