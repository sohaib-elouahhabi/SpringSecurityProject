package org.security.soringsecurityproject.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private int id;
    private String firstName;
    private int note;

    public StudentController(int id, String firstName, int note) {
        this.id = id;
        this.firstName = firstName;
        this.note = note;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
