package ashok.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class DemoController {

    @GetMapping("/welcome")
    public String welcomeMsg(Model model){
        //int a = 10/0;
         /* try {
            int a = 10/0;
        }catch (ArithmeticException e){
            throw new ArithmeticException("Arithmetic Exception please check given argument");
        }*/

        model.addAttribute("msg","Welcome to home page");
        int a = 10/0;

        return "index";
    }
    /*@ExceptionHandler(value = ArithmeticException.class)
    public String exHandler(ArithmeticException ex , Model model){

        model.addAttribute("erR" , ex.getMessage());
        model.addAttribute("date", LocalDateTime.now());

        return "error";
    }*/
}
