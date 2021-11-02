package com.example.usercapapi.controller;


import com.example.usercapapi.model.User;
import com.example.usercapapi.repositroy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userService;

    @GetMapping("")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable int id){
        return userService.findById(id);
    }

    @PostMapping("/c")
    public User createUser(@RequestBody User user){
        int id = userService.findAll().size();
        id=id+1;
        user.setId(id);
        userService.insert(user);
        return user;
    }

    @PostMapping("/log")
    public User Login(@RequestBody User user){
        List<User> users = userService.findAll();
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
                return u;
            }
        }
        return null;
    }

}
