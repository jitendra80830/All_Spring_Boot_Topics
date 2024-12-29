package ashok.in.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

    @GetMapping("/welcome")
    public String welcomeMsg(){

        return "Welcome to you";
    }

    @GetMapping("/greet")
    public String getGreet(){
        return "Good Morning Jitendra";
    }
}
