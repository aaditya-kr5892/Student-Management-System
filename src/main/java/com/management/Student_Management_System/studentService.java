package com.management.Student_Management_System;

import java.util.List;

public interface studentService {
    public List<data> listAllStudents();
    public data saveStudent(data student);
    public data getStudentById(int id);
    public data updateStudent(data student);

    data findStudentByRollNumber(String rollNumber);
//    public data findByRollNumber(String rollNumber);
    public void deleteStudent(int id);
    public boolean existsByRollNumber(String rollNumber);
}
