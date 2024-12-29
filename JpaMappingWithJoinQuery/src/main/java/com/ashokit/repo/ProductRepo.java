package com.ashokit.repo;

import com.ashokit.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product , Integer> {

}
