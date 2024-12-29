package com.batch.config;

import com.batch.entities.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer item) throws Exception {

        //own logic

        return item;
    }
}
