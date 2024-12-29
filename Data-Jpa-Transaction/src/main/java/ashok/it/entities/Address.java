package ashok.it.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {


    public Address() {
    }

    public Address(String city, String state, String country, Integer empId) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.empId = empId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;

    private String city;

    private String state;

    private String country;

    private Integer empId;

    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
}
