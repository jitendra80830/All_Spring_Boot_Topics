package ashok.it.entities;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addIt;

    private String city;

    private String state;

    private String type;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    public Integer getAddIt() {
        return addIt;
    }

    public void setAddIt(Integer addIt) {
        this.addIt = addIt;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
