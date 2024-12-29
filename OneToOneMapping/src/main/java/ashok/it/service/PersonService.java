package ashok.it.service;

import ashok.it.entities.Passport;
import ashok.it.entities.Person;
import ashok.it.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public void savePerson(){
        Person person = new Person();
        person.setPersonName("Jitendra");
        person.setPersonGender("Male");

        Passport passport = new Passport();
        passport.setPassportNum(222222);
        passport.setIssueDate(LocalDate.now());
        passport.setExpDate(LocalDate.now().plusYears(10));

        person.setPassport(passport);
        passport.setPerson(person);
        personRepo.save(person);
    }
    public void delete(){
        personRepo.deleteById(1);
    }


}
