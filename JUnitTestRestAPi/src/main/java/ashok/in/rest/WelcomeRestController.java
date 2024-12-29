package ashok.in.rest;

import ashok.in.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    @Autowired
    WelcomeService welcomeService;

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcomeMsg(){
        String mgs = welcomeService.getMgs();

        return new ResponseEntity<>(mgs, HttpStatus.OK);

    }

    @GetMapping("/greet")
    public ResponseEntity<String> getGreetMsg(){
        String mgs = welcomeService.getGreetMsg();

        return new ResponseEntity<>(mgs, HttpStatus.OK);

    }
}
