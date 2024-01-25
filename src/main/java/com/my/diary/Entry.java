package com.my.diary;

import jakarta.persistence.*;

@Entity
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String date;
    private String text;

    public Entry() {}

    public Entry(String date, String text) {
        this.date = date;
        this.text = text;
    }
    //getters
    public int getId() { return id; }
    public String getDate() { return date; }
    public String getText() { return text; }

    //setters
    public void setId(int id) { this.id = id; }
    public void setDate(String date) { this.date = date; }
    public void setText(String text) { this.text = text; }
}
