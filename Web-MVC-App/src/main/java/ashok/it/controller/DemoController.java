package ashok.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @GetMapping("/welcome")
    public String getWelcomeMsg(Model model){

        model.addAttribute("msg","Welcome to ashok it");

        return "index";
    }

    @GetMapping("/login")
    public String login(){

        return "redirect:/welcome";
    }

    @GetMapping("/greet")
    @ResponseBody
    public String getGreet(){

        return "Good Morning Jitendra";
    }
}
