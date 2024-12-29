package ashok.it;

import ashok.it.entities.Book;
import ashok.it.repo.BookRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaTimestampApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaTimestampApplication.class, args);

		BookRepo repo = context.getBean(BookRepo.class);

		Book entity = new Book();
		/*entity.setBookId(2);
		entity.setBookName("java");
		//entity.setBookPrice(99999.0);


		System.out.println(entity);
		System.out.println("...................................._______________.......");


		Book savedBook = repo.save(entity);

		System.out.println(savedBook);*/


		Book book  = repo.findById(1).get();
		/*book.setBookName("Python");
		book.setBookPrice(22.0);*/
		book.setActiveSW("N");

		repo.save(book);

		System.out.println("Done.......");


	}

}
