package ashok.it.repo;

import ashok.it.binding.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User ,Integer> {
}
