package com.my.diary.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data; //Use lombok package to automatically set up the getters and setters for your fields
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "diary_entry")
@NoArgsConstructor
@AllArgsConstructor
public class Entry {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "DIARY_DATE")
    private String date;
    @Column(name = "DIARY_TEXT")
    private String text;

//    public Entry() {}
//
//    public Entry(String date, String text) {
//        this.date = date;
//        this.text = text;
//    }
//    //getters
//    public int getId() { return id; }
//    public String getDate() { return date; }
//    public String getText() { return text; }
//
//    //setters
//    public void setId(int id) { this.id = id; }
//    public void setDate(String date) { this.date = date; }
//    public void setText(String text) { this.text = text; }
}
