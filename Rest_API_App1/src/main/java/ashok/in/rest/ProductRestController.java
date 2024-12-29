package ashok.in.rest;

import ashok.in.binding.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

    ;

    @GetMapping("/product")
    public Product getProduct(@RequestParam("pid") String pid){
        Product p = new Product("Book",pid);

        return p;
    }
}
