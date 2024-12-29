package ashokit.in.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

    private Logger logger = LoggerFactory.getLogger(MsgRestController.class);


    @GetMapping("/welcome")
    public String msgWelcome(){
        String msg = "Welcome to home";

        logger.trace("This is trace msg");
        logger.debug("This is debug msg");
        logger.info("This is info msg");
        logger.error("This is error msg");

        return msg;
    }
}
