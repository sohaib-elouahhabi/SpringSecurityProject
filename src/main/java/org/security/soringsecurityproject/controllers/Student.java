package org.security.soringsecurityproject.controllers;


public class Student {

    private int id;
    private String firstName;
    private int note;

    public Student(int id, String firstName, int note) {
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
