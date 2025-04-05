package org.security.soringsecurityproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<Student>(List.of(
            new Student(1,"sohaib",14),
            new Student(2,"ouahhabi",17),
            new Student(3,"adam",16)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }


}
