package ashok.it.service;

import ashok.it.binding.User;
import ashok.it.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    //insert Data
    public boolean saveUser(User user){

        userRepo.save(user);
        return user.getUserId() >0;
    }

    //Retrieve data

    public List<User> getAllUser(){
        return userRepo.findAll();
    }
}
