package com.management.Student_Management_System;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<data,Integer> {
    public data findByRollNumber(String rollNumber);
    public boolean existsByRollNumber(String rollNumber);
}
