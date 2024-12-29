package ashok.in.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Customer_Quiz")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String address;
}
