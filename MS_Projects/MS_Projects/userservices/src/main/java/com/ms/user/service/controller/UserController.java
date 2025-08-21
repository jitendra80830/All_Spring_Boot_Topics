package com.ms.user.service.controller;

import com.ms.user.service.entities.User;
import com.ms.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        return new ResponseEntity<>(userService.create(user), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable int userId) {
        return new ResponseEntity<>(userService.getSingleUser(userId), HttpStatus.OK);
    }
}
