package com.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Product {
    @Id
    private Integer pid;
    private String productName;
    private int qty;
    private int price;

}
