package ashok.it.repo;

import ashok.it.entities.Person;
import ashok.it.entities.PersonPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, PersonPK> {

}
