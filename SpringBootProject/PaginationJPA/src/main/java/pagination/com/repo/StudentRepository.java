package pagination.com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pagination.com.entities.Student;

public interface StudentRepository extends JpaRepository<Student , Integer> {

}
