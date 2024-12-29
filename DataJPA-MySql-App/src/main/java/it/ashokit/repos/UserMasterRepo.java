package it.ashokit.repos;

import it.ashokit.entities.UserMasterEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserMasterRepo extends CrudRepository<UserMasterEntity , Integer> {

    //select * from users_master where user_city = city
    public List<UserMasterEntity> findByCity(String city);

    //select * from users_master where user_age>=age
    public List<UserMasterEntity> findByAgeGreaterThanEqual(int age);

    //select * from users_master where user_gender = gender
    public List<UserMasterEntity> findByGender(String gender);

    //select * from users_master where user_email = email
    public List<UserMasterEntity> findByEmail(String email);

    //select * from users_master where user_gender = gender and user_city = city
    public List<UserMasterEntity> findByGenderAndCity(String gender , String city);

    //select user_email from users_master where user_city = 'UP';

    //HQL Query
    @Query("select email from UserMasterEntity where city = :city")
    public List<String> getIndianEmail(String city);

    @Query("from UserMasterEntity")
    public List<UserMasterEntity> getAllUsers();

    //SQl Query
    @Query(value = "select * from users_master", nativeQuery = true)
    public List<UserMasterEntity > getAllUserSQl();

    //Update Custom Query
    @Query("update UserMasterEntity set age = :age where id = :uId")
    @Transactional
    @Modifying
    public void updateAge(int age , int uId);

    //Delete Custom Query
    @Query("delete from UserMasterEntity where id = :uId")
    @Transactional
    @Modifying
    public void deleteByUserId(int uId);


}
