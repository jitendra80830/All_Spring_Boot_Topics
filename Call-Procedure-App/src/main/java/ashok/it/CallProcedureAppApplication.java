package ashok.it;

import ashok.it.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CallProcedureAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CallProcedureAppApplication.class, args);
		ProductService productService = context.getBean(ProductService.class);
		productService.getProducts();
	}

}
