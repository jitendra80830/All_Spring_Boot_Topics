package come.demo.service;

import come.demo.entities.Employee;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;

import java.util.List;

public interface EmployeeService {

    ResponseEntity<List<Employee>> getAll();

    ResponseEntity<Employee> create(Employee employee);

    ResponseEntity<Flux<Employee>> geStream() throws InterruptedException;
}
