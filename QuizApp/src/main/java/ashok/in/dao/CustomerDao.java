package ashok.in.dao;

import ashok.in.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer ,Integer> {
}
