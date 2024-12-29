package ashok.it.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductException {

    @GetMapping("/product/{pid}")
    public String productHandler(@PathVariable Integer pid){

        if(pid > 100){
            throw  new ProductExceptionHandler("Invalid Product Id.");
        }
        return "product -2000 INR";
    }
}
