package ashok.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Locale;

@Controller
public class CourseController {

    @GetMapping("/course/{cname}")
    public String getCourseInfo(@PathVariable("cname") String cname ,
                                Model model){
        String courseTest = StringUtils.capitalize(cname)+" New batch will start soon..";

        model.addAttribute("msg",courseTest);

        return "index";

    }

}
