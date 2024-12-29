package ashok.it.controller;

import ashok.it.binding.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    public UserController(){
        System.out.println("User Controller called..");
    }

    @GetMapping("/users")
    public String getUsers(Model model){
        User u1 = new User(101 , "jitendra" , "jitendra.kumar@adeptia.com");
        User u2 = new User(102 , "Raju" , "raju.kumar@adeptia.com");
        User u3 = new User(103 , "Ram" , "ram.kumar@adeptia.com");

        List<User> userList = Arrays.asList(u1, u2, u3);
        model.addAttribute("usersData",userList);

        return "users_data";

    }

    @GetMapping("/user")
    public String getUserData(Model model){

        User user =new User(101 , "jitendra" , "jitendra.kumar@adeptia.com");

        model.addAttribute("user",user);

        return "user-data";
    }
    @GetMapping("/email")
    public String getUserEmail(Model model){

        model.addAttribute("data","jitendra.kumar@deptia.com");

        return "index";

    }

    @GetMapping("/name")
    public ModelAndView userData(){
        ModelAndView mav = new ModelAndView();
        //mav.addObject("id",101);
        mav.addObject("data","Jitendra");

        mav.setViewName("index");

        return mav;
    }
}
