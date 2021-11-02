package com.example.usercapapi.controller;


import com.example.usercapapi.model.Journal;
import com.example.usercapapi.repositroy.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    JournalRepository journalService;

    @GetMapping("")
    public List<Journal> findAll(){
        return journalService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Journal> findById(@PathVariable int id){
        return journalService.findById(id);
    }

    @PostMapping("/c")
    public Journal createJournal(@RequestBody Journal journal){
        journalService.insert(journal);
        return journal;
    }

}
