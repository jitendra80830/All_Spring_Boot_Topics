package ashok.in.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to home.";
    }

    @GetMapping("/greet")
    public String greet(){
        return "Good Morning";
    }

}
