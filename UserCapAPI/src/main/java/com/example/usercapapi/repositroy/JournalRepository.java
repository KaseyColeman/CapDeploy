package com.example.usercapapi.repositroy;

import com.example.usercapapi.model.Journal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepository extends MongoRepository<Journal, Integer> {
}
