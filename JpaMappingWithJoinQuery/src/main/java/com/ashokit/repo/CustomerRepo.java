package com.ashokit.repo;

import com.ashokit.dto.OrderResponse;
import com.ashokit.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer , Integer> {

    @Query("select new com.ashokit.dto.OrderResponse(c.name,p.productName) from Customer c JOIN c.products p")
    public List<OrderResponse> getCustomerNameAndProductName();
}
