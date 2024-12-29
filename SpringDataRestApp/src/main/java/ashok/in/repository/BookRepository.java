package ashok.in.repository;

import ashok.in.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "book")
public interface BookRepository extends JpaRepository<Books ,Integer> {

}
