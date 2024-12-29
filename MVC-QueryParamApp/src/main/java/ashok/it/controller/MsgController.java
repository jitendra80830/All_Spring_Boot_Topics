package ashok.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.stream.events.StartDocument;

@Controller
public class MsgController {

    @GetMapping("/greet")
    public String greetMsg(@RequestParam("name") String name , Model model){

        String msgText = "Good Morning "+name;
        model.addAttribute("msg",msgText);

        return "index";
    }

    @GetMapping("/info")
    public String getInfo(@RequestParam("course") String course ,
                          @RequestParam("trainer") String trainer ,
                          Model model){

        String infoText = "Course Name:: "+course+" And Trainer:: "+trainer;
        System.out.println(infoText);
        model.addAttribute("msg",infoText);

        return "index";
    }
}
