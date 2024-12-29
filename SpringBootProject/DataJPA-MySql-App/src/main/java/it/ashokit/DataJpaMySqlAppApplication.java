package it.ashokit;

import it.ashokit.UserMasterService.UserService;
import it.ashokit.entities.UserMasterEntity;
import it.ashokit.repos.UserMasterRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaMySqlAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaMySqlAppApplication.class, args);

		//getting repository object
		UserService userService = context.getBean(UserService.class);

		//userService.userSave();
		//userService.testFindByMethod();

		//userService.testFindByMethod();
		//userService.testFindByMethod();
		//userService.testFindByMethod();
		userService.testCustomQuery();

		System.out.println("Done.............!");
	}

}
