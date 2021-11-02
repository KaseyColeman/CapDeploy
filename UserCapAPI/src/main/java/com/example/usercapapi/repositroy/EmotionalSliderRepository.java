package com.example.usercapapi.repositroy;

import com.example.usercapapi.model.EmotionalSliders;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmotionalSliderRepository extends MongoRepository<EmotionalSliders, Integer> {
}
