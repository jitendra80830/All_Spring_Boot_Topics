package in.ashokit;

import in.ashokit.service.LibraryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CarAppsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CarAppsApplication.class, args);
		LibraryService bean = context.getBean(LibraryService.class);
		bean.libararyProcess();
	}

}
