package com.ms.user.service.service;

import com.ms.user.service.entities.User;

import java.util.List;

public interface UserService {

    User create(User user);

    List<User> getAll();

    User getSingleUser(int userId);
}
