package com.example.usercapapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "sliderData")
public class EmotionalSliders {

    @Id
    private int id;
    private String date;
    private int slider1;
    private int slider2;
    private int slider3;
    private int slider4;
    private int userId;

    public EmotionalSliders() {}

    public EmotionalSliders(int id, String date, int slider1, int slider2, int slider3, int slider4, int userId) {
        this.id = id;
        this.date = date;
        this.slider1 = slider1;
        this.slider2 = slider2;
        this.slider3 = slider3;
        this.slider4 = slider4;
        this.userId = userId;
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

    public int getSlider1() {
        return slider1;
    }

    public void setSlider1(int slider1) {
        this.slider1 = slider1;
    }

    public int getSlider2() {
        return slider2;
    }

    public void setSlider2(int slider2) {
        this.slider2 = slider2;
    }

    public int getSlider3() {
        return slider3;
    }

    public void setSlider3(int slider3) {
        this.slider3 = slider3;
    }

    public int getSlider4() {
        return slider4;
    }

    public void setSlider4(int slider4) {
        this.slider4 = slider4;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}