package com.example.usercapapi.controller;


import com.example.usercapapi.model.HealthProvider;
import com.example.usercapapi.model.User;
import com.example.usercapapi.repositroy.HealthProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/health")
public class HealthProviderController {

    @Autowired
    HealthProviderRepository healthService;

    @GetMapping("")
    public List<HealthProvider> findAll(){
        return healthService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<HealthProvider> findById(@PathVariable int id){
        return healthService.findById(id);
    }

    @PostMapping("/c")
    public User createUser(@RequestBody HealthProvider user){
        healthService.insert(user);
        return user;
    }
}


