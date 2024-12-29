package ashok.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

    public MsgController(){
        System.out.println("MsgController: Controller called...");
    }

    @GetMapping("/welcome")
    public ModelAndView getWelcomeMsg(){

        ModelAndView mv = new ModelAndView();

        //setting data for UI
        mv.addObject("msg", "Welcome to ashok It");

        //returning presentation file
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/greet")
    public ModelAndView greetMessage(){
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg","All the best");
        mv.setViewName("index");

        return mv;
    }

}
