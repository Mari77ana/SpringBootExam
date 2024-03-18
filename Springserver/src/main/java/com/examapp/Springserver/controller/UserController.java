package com.examapp.Springserver.controller;


import com.examapp.Springserver.model.users.User;
import com.examapp.Springserver.model.users.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired // Independence Injection
    private UserDao userDao;

    @GetMapping("/user/get-all") // endpoint
    public List<User> getAllUsers() {
        return userDao.getAllUsers();

    }

    @PostMapping("/user/save")
    public User save(@RequestBody User user) {
        return userDao.save(user);
    }


    @GetMapping("/user/get/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userDao.getUserById(userId);
    }





}
