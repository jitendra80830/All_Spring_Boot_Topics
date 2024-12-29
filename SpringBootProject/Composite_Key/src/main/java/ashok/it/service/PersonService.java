package ashok.it.service;

import ashok.it.entities.Person;
import ashok.it.entities.PersonPK;
import ashok.it.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public void getPersonRecordById(){
        PersonPK personPK = new PersonPK();
        personPK.setAadhar(222l);
        personPK.setPassport("BtNRW666");
        Optional<Person> person = personRepo.findById(personPK);

        if(person.isPresent()){
            System.out.println(person.get());
        }
        //System.out.println(person);
    }
}
