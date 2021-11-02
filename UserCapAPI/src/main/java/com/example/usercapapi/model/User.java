package com.example.usercapapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document(collection = "users")
public class User {

    @Id
    protected int id;
    protected String name;
    protected String username;
    protected String password;
    protected String email;
    protected String age;
    protected String Authority;
    protected ArrayList<String> pronouns = new ArrayList<>();

    public User(){}

    public User(String username, String pas){
        this.username = username;
        this.password = pas;
    }

    public User(String name, String username, String password, String email, String age, String authority) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.Authority = authority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAuthority() {
        return Authority;
    }

    public void setAuthority(String authority) {
        Authority = authority;
    }

    public ArrayList<String> getPronouns() {
        return pronouns;
    }

    public void setPronouns(ArrayList<String> pronouns) {
        this.pronouns = pronouns;
    }
}
