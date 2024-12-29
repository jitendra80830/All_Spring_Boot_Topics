package ashokit.in.rest;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping(value = "/admin")
    @Secured(value = "ADMIN")
    public String admin(){
        return "<h3> welcome Admin :) </h3>";
    }

    @GetMapping(value = "/user")
    @Secured({ "ADMIN", "USER" })
    public String user(){
        return "<h3> welcome user :) </h3>";
    }

    @GetMapping(value = "/")
    public String welcome(){
        return "<h3> welcome :)</h3>";
    }

}
