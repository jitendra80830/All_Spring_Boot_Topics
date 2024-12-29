package ashok.it.repo;

import ashok.it.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book , Integer> {

}

