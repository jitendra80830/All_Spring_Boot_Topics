package it.ashokit.UserMasterService;

import it.ashokit.entities.UserMasterEntity;
import it.ashokit.repos.UserMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMasterRepo repo;

    public void testCustomQuery(){
        //List<String> entities = repo.getIndianEmail("UP");
        //List<UserMasterEntity> entities = repo.getAllUsers();
        /*List<UserMasterEntity> entities = repo.getAllUserSQl();

        entities.forEach(entity ->{
            System.out.println(entity);
        });*/
        //repo.updateAge(23 , 101);
        repo.deleteByUserId(101);
    }
    public void testFindByMethod(){
        //List<UserMasterEntity> entities = repo.findByCity("UP");
        //List<UserMasterEntity> entities  = repo.findByAgeGreaterThanEqual(38);
        //List<UserMasterEntity> entities = repo.findByGender("Male");
        //List<UserMasterEntity> entities = repo.findByEmail("jitenra@gmail.com");
        //List<UserMasterEntity> entities = repo.findByGenderAndCity("Male", "UP");`

    }
    public void userSave(){

        //System.out.println(repo.getClass().getName());

        //setting data in  entity object
        UserMasterEntity entity = new UserMasterEntity();

        entity.setId(102);
        entity.setName("Prashant");
        entity.setEmail("Prashant@gmail.com");
        entity.setGender("Male");
        entity.setCity("UP");
        entity.setAge(30);

        UserMasterEntity entity1 = new UserMasterEntity();

        entity1.setId(201);
        entity1.setName("akash");
        entity1.setEmail("akash@gmail.com");
        entity1.setGender("Male");
        entity1.setCity("Bihar");
        entity1.setAge(39);


        UserMasterEntity entit2 = new UserMasterEntity();

        entit2.setId(202);
        entit2.setName("manish");
        entit2.setEmail("manish@gmail.com");
        entit2.setGender("Male");
        entit2.setCity("UP");
        entit2.setAge(50);

        List<UserMasterEntity> userMasterEntities = Arrays.asList(entity1, entit2);
        //inserting data
        //repo.save(entity);

        repo.saveAll(userMasterEntities);
    }
}
