package ashok.in.service;

import ashok.in.dao.CustomerDao;
import ashok.in.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;


    @Override
    public ResponseEntity<List<Customer>> getCustomer() {
        System.out.println("Calling for dao customer");
        return new ResponseEntity<>(customerDao.findAll() , HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Customer> createCustomer(Customer customer) {
        return new ResponseEntity<>(customerDao.save(customer) , HttpStatus.CREATED);
    }

    @Override
    public Flux<Customer> getCustomerStream() {
        System.out.println("Calling Customer Dao");
        List<Customer> all = customerDao.findAll();
        return Flux.fromIterable(all);
    }
}
