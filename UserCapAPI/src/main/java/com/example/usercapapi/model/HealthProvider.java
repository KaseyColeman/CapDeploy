package com.example.usercapapi.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document(collection = "healthProviders")
public class HealthProvider extends User{

    public ArrayList<Integer> patients = new ArrayList<>();

    public  HealthProvider(){}

    public HealthProvider(int id){
        this.id = id;
    }

    public HealthProvider (String name, String username, String password, String email ){
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public HealthProvider (String name, String username, String password, String email,String authority, ArrayList<Integer> patients ){
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.patients = patients;
        this.Authority = authority;
    }

    public ArrayList<Integer> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Integer> patients) {
        this.patients = patients;
    }



}
