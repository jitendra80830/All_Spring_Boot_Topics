package ashok.it.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Entity
@Embeddable
public class PersonPK {


    private Long aadhar;
    private String passport;

    public Long getAadhar() {
        return aadhar;
    }

    public void setAadhar(Long aadhar) {
        this.aadhar = aadhar;
    }

    public String getPassport() {
        return passport;
    }

    public PersonPK setPassport(String passport) {
        this.passport = passport;
        return null;
    }

    @Override
    public String toString() {
        return "PersonPK{" +
                "aadhar=" + aadhar +
                ", passport='" + passport + '\'' +
                '}';
    }
}
