package ashok.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    public BookController(){
        System.out.println("BookController: Contractor called..");
    }

    @GetMapping("/book")
    public ModelAndView bookData(){

        ModelAndView mv = new ModelAndView();

        mv.addObject("id",101);
        mv.addObject("name","Jitendra Kumar");
        mv.addObject("price",120.00);

        mv.setViewName("book");
        return mv;
    }
}
