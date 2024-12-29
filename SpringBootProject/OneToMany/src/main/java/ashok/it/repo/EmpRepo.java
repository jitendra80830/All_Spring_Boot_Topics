package ashok.it.repo;

import ashok.it.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee , Integer> {
}
