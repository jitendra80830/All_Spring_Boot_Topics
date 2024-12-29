package com.webflux.service;

import com.webflux.binding.Customer;
import com.webflux.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao dao;


    public List<Customer> loadAllCustomer() {
        long start = System.currentTimeMillis();
        List<Customer> customer = dao.getCustomer();
        long end = System.currentTimeMillis();
        System.out.println("Total Time approach-1 :: " + (end - start));
        return customer;
    }

    public Flux<Customer> loadCustomerStream() {
        long start = System.currentTimeMillis();
        Flux<Customer> customerStream = dao.getCustomerStream();
        long end = System.currentTimeMillis();
        System.out.println("Total Time approach-2 :: " + (end - start));
        return customerStream;
    }
}
