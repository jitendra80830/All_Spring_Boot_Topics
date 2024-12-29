package ashok.it.repo;

import ashok.it.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product ,Integer> {

    @Query(value = "call getProductdata()" ,nativeQuery = true)
    public List<Product> getAllProduct();
}
