package ashok.it.repo;

import ashok.it.entities.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp , Integer> {
}
