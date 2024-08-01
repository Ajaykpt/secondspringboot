package com.dara.demodata.service;

import com.dara.demodata.model.Student;
import com.dara.demodata.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repo;

    public List<Student>getStudent(){
        return  repo.findAll();
    }
}
