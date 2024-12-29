package ashok.in.service;

import ashok.in.model.Customer;
import ashok.in.model.Question;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;

import java.util.List;

public interface CustomerService {

    ResponseEntity<List<Customer>> getCustomer();

    ResponseEntity<Customer> createCustomer(Customer customer);

    Flux<Customer> getCustomerStream();
}
