package ashok.it.service;

import ashok.it.entities.Person;
import ashok.it.entities.PersonPK;
import ashok.it.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public void savePerson(){
        PersonPK personPK = new PersonPK();
        personPK.setAadhar(222l);
        personPK.setPassport("BtNRW666");

        Person person = new Person();

        person.setName("Jitendra");
        person.setEmail("jitendra@gmail.com");
        person.setPersonPK(personPK);

        personRepo.save(person);
    }
}
