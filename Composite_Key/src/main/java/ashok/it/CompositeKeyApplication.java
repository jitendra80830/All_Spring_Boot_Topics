package ashok.it;

import ashok.it.entities.Person;
import ashok.it.entities.PersonPK;
import ashok.it.repo.PersonRepo;
import ashok.it.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CompositeKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CompositeKeyApplication.class, args);

		PersonService service = context.getBean(PersonService.class);

		service.getPersonRecordById();
		System.out.println("Save Done............");

	}

}
