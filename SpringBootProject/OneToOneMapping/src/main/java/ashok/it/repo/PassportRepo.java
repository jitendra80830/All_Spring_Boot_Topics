package ashok.it.repo;

import ashok.it.entities.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepo extends JpaRepository<Passport , Integer> {
}
