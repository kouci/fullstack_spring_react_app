package com.kouciDev.devLocal.service;

import com.kouciDev.devLocal.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
