package ashok.it.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookControlelr {

    @GetMapping("/book")
    public String getBook(){

        String str = null;
        int l = str.length();
        return "Java";
    }
}
