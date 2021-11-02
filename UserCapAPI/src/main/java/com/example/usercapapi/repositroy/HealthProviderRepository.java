package com.example.usercapapi.repositroy;



import com.example.usercapapi.model.HealthProvider;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HealthProviderRepository extends MongoRepository<HealthProvider, Integer> {

}
