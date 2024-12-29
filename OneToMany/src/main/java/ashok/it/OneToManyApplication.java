package ashok.it;

import ashok.it.service.EmpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OneToManyApplication.class, args);

		EmpService empService = context.getBean(EmpService.class);
		//empService.getAddData();
		empService.deleteEmpRec();
	}

}
