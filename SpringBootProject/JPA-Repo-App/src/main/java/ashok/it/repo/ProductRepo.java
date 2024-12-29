package ashok.it.repo;

import ashok.it.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product , Integer> {
}
