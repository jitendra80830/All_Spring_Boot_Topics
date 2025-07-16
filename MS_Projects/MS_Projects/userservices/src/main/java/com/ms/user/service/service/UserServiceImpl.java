package com.ms.user.service.service;

import com.ms.user.service.customExceptions.ResourceNotFoundException;
import com.ms.user.service.entities.User;
import com.ms.user.service.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public User create(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User getSingleUser(int userId) {
        return userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server." + userId));
    }
}
