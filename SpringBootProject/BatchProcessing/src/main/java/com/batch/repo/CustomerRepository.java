package com.batch.repo;

import com.batch.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CustomerRepository extends JpaRepository<Customer , Serializable> {
}
