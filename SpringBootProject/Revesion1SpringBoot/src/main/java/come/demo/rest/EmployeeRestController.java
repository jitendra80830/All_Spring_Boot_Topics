package come.demo.rest;

import come.demo.apis.AllAPIs;
import come.demo.entities.Employee;
import come.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController implements AllAPIs<Employee> {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public ResponseEntity<List<Employee>> getAll() {
        return employeeService.getAll();
    }

    @Override
    public ResponseEntity<Employee> create(Employee employee) {
        return employeeService.create(employee);
    }

    @Override
    public ResponseEntity<Flux<Employee>> getAllStream() throws InterruptedException {
        return employeeService.geStream();
    }
}
