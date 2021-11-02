package com.example.usercapapi.controller;


import com.example.usercapapi.model.EmotionalSliders;
import com.example.usercapapi.repositroy.EmotionalSliderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/eslider")
public class EmotionalSlidersController {
    @Autowired
    EmotionalSliderRepository sliderService;

    @GetMapping("")
    public List<EmotionalSliders> findAll(){
        return sliderService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<EmotionalSliders> findById(@PathVariable int id){
        return sliderService.findById(id);
    }

    @PostMapping("/c")
    public EmotionalSliders createSlider(@RequestBody EmotionalSliders slider) {
        int id = sliderService.findAll().size();
        id=id+1;
        slider.setId(id);
        sliderService.insert(slider);
        return slider;
    }
}
