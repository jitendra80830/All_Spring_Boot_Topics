package com.ashokit.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Customer {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
    private String gender;

    @OneToMany(targetEntity = Product.class ,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk" , referencedColumnName = "id")
    private List<Product> products;
}
