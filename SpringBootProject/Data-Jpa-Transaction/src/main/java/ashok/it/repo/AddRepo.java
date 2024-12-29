package ashok.it.repo;

import ashok.it.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddRepo extends JpaRepository<Address ,Integer> {
}
