package com.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class BatchTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchTransactionApplication.class, args);
	}

}
