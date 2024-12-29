package com.db.mysql2.respo;

import com.db.mysql2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product , Integer> {
}
