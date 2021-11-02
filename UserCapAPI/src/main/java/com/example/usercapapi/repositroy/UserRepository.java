package com.example.usercapapi.repositroy;

import com.example.usercapapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {



}
