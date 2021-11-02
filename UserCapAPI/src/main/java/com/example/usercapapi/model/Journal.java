package com.example.usercapapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "journals")
public class Journal {

    @Id
    private int id;
    private String date;
    private String entryName;
    private String entry;

    public Journal() {}

    public Journal(int id, String date, String entryName, String entry) {
        this.id = id;
        this.date = date;
        this.entryName = entryName;
        this.entry = entry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }
}
