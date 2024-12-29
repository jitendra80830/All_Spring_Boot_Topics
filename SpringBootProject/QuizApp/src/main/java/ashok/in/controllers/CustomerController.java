package ashok.in.controllers;

import ashok.in.AllAPI.APIs;
import ashok.in.CustomeExeption.BadAPIRequest;
import ashok.in.model.Customer;
import ashok.in.model.Question;
import ashok.in.service.CustomerServiceImpl;
import ashok.in.service.WebFluxCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController implements APIs<Customer ,String>, WebFluxCustomer<Customer> {

    @Autowired
    private CustomerServiceImpl customerService;

    @Override
    public ResponseEntity<List<Customer>> get() throws BadAPIRequest {
        long start = System.currentTimeMillis();
        ResponseEntity<List<Customer>> customer = customerService.getCustomer();
        long end = System.currentTimeMillis();
        System.out.println("Approach1: "+(end -start));
        return customer;
    }

    @Override
    public ResponseEntity<Customer> create(Customer customer) throws BadAPIRequest {
        return customerService.createCustomer(customer);
    }

    @Override
    public ResponseEntity<List<Customer>> getBySpecificColumn(String column) throws BadAPIRequest {
        return null;
    }


    @Override
    public Flux<Customer> getCustomerStream() {
        long start = System.currentTimeMillis();
        Flux<Customer> customerStream = customerService.getCustomerStream();
        long end = System.currentTimeMillis();
        System.out.println("Web Flux Approach: "+(end -start));
        return customerStream;
    }
}
