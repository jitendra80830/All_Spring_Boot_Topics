package come.demo.service.impl;

import come.demo.entities.Employee;
import come.demo.repo.EmployeeRepo;
import come.demo.service.EmployeeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.LocalTime;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  //  private Logger logger = LoggerF
    //private static final Logger logger = LogManager.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public ResponseEntity<List<Employee>> getAll() {
        return new ResponseEntity<>(employeeRepo.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Employee> create(Employee employee) {
        return new ResponseEntity<>(employeeRepo.save(employee), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Flux<Employee>> geStream() throws InterruptedException {
        List<Employee> all = null;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            //System.out.println("Going..");
            //logger.atInfo();
            all = employeeRepo.findAll();
            Thread.sleep(2000);
            System.out.println("Waiting..");
        }
        long end = System.currentTimeMillis();
        System.out.println("Total Time taken : "+(end-start));
        return new ResponseEntity<>(Flux.fromIterable(all) , HttpStatus.OK);
    }
}
