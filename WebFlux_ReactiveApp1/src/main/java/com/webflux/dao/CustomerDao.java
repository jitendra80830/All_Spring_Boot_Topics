package com.webflux.dao;

import com.webflux.binding.Customer;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.io.InputStream;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Repository
public class CustomerDao {

    public static void sleepExecution(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Customer> getCustomer() {
        return IntStream.range(0, 10)
                .peek(CustomerDao::sleepExecution)
                .peek(i -> System.out.println("Processing Count :: " + i))
                .mapToObj(i -> new Customer(i, "customer" + i)).
                collect(Collectors.toList());
    }

    public Flux<Customer> getCustomerStream() {
        return Flux.range(0, 10)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(i -> System.out.println("Processing Count" + i))
                .map(i -> new Customer(i, "Customer" + i));
    }
}
