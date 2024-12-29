package com.ashokit.controller;

import com.ashokit.dto.OrderRequest;
import com.ashokit.dto.OrderResponse;
import com.ashokit.entity.Customer;
import com.ashokit.repo.CustomerRepo;
import com.ashokit.repo.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ProductRepo productRepo;

    @PostMapping("/create")
    public Customer placeOrder(@RequestBody OrderRequest request){
        //request.setCustomer(request.getCustomer().getProducts());
        return customerRepo.save(request.getCustomer());
    }

    @GetMapping("/get")
    public List<Customer> getOrder(){
        return customerRepo.findAll();
    }

    @GetMapping("/name")
    public List<OrderResponse> getCustomerNameAndProductNameUsingJoin(){
        logger.info("Getting Customer Name And Product Name Using Join Queries....... ");
        logger.debug("Getting Record using Joining Query");
        return customerRepo.getCustomerNameAndProductName();
    }
}
