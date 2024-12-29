package ashok.it.controler;

import ashok.it.binding.User;
import ashok.it.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * To load the empty form
     * @param model
     * @return String
     */
    @GetMapping("/")
    public String loadForm(Model model){

        model.addAttribute("user",new User());

        return "index";
    }

    /**
     * To handle submit the form
     * @param model
     * @return
     */
    @PostMapping("/user")
    public String toHandleSubmitForm(@Valid User user , BindingResult result , Model model){

        System.out.println(user);
        System.out.println(user.getName() +" "+user.getEmail()+" "+user.getPhno());

        if(result.hasErrors()){
            return "index";
        }

        boolean saveUser = userService.saveUser(user);

        if(saveUser){
            model.addAttribute("msg","User Data is Saved Successfully.");
        }

        return "index";
    }

    @GetMapping("/users")
    public String viewUsers(Model model){

        List<User> allUser = userService.getAllUser();
        model.addAttribute("users",allUser);

        return "view-users";
    }

}
