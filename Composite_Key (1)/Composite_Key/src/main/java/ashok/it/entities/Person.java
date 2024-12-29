package ashok.it.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Person {

    private String name;

    private String email;

    @EmbeddedId
    private PersonPK personPK;

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

    public PersonPK getPersonPK() {
        return personPK;
    }

    public void setPersonPK(PersonPK personPK) {
        this.personPK = personPK;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", personPK=" + personPK +
                '}';
    }
}
