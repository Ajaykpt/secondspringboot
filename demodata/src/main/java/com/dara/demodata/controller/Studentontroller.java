package com.dara.demodata.controller;

import com.dara.demodata.model.Student;
import com.dara.demodata.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class Studentontroller {
    @Autowired
    StudentService studentService;
    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }
}
