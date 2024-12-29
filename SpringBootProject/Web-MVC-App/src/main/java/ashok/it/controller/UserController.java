package ashok.it.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.session.StandardSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/login")
    public String test1(HttpServletRequest request, Model model){

        String name = request.getParameter("name");

        System.out.println(name);

        HttpSession session = request.getSession();
        session.setAttribute("name" , name);

        model.addAttribute("msg","User Logg in Successfully with Name: "+name);


        return "index";
    }
    @GetMapping("/dashboard")
    public String test2(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        System.out.println(name);
        model.addAttribute("msg","Welcome to dashboard: "+name);
        return "index";
    }

    @GetMapping("/logged")
    public String logOut(HttpServletRequest request , Model model){

        HttpSession session = request.getSession();
        session.invalidate();
        model.addAttribute("msg","Session is logged out Successfully");

        return "index";
    }
}
