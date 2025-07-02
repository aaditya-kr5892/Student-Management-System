package com.management.Student_Management_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImpl implements studentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<data> listAllStudents(){
        return studentRepository.findAll();
    }
    @Override
    public data saveStudent(data student){
        return studentRepository.save(student);
    }
    @Override
    public data getStudentById(int id){
        return studentRepository.findById(id).get();
    }
    @Override
    public data updateStudent(data student){
        return studentRepository.save(student);
    }
    @Override
    public data findStudentByRollNumber(String rollNumber) {
        return studentRepository.findByRollNumber(rollNumber);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
    @Override
    public boolean existsByRollNumber(String rollNumber) {
        return studentRepository.existsByRollNumber(rollNumber);
    }
}
