package ashok.it;

import ashok.it.service.EmpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaTransactionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaTransactionApplication.class, args);

		EmpService service = context.getBean(EmpService.class);
		service.saveEmp();

		System.out.println("Saved Data..........");
	}

}
