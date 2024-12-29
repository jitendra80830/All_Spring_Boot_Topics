package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MesgRestController {

    public MesgRestController(){
        System.out.println("MesgRestController Constructor Called..");
    }

    @GetMapping("/")
    public String mesgGenerater(){
        return "Wel Come To Spring Boot";
    }
}
