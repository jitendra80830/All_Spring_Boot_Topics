package ashok.it.binding;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="USER_MASTER_TBL")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Size(min = 3 , max = 6 , message = "Min 3 and Max 6 characters allowed")
    @NotEmpty(message = "Name is Mandatory")
    //@NotNull(message = "Name is Mandatory")
    private String name;

    @NotEmpty(message = "Email is Mandatory")
    @Email(message = "Enter a valid email")
    //@NotNull(message = "Email is Mandatory")
    private String email;

    @NotNull(message = "Phone Number is Mandatory")
    private Long phno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhno() {
        return phno;
    }

    public void setPhno(Long phno) {
        this.phno = phno;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phno=" + phno +
                '}';
    }
}
