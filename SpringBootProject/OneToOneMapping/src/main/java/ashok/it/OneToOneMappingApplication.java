package ashok.it;

import ashok.it.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OneToOneMappingApplication.class, args);

		PersonService personService = context.getBean(PersonService.class);
		//personService.savePerson();
		personService.delete();

		System.out.println("Saved data done........");
	}

}
