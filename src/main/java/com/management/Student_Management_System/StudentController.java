package com.management.Student_Management_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class StudentController {

    @Autowired
    private studentService studservice;

    // 1. Handle Add Student (with duplicate rollNumber catch)
    @PostMapping("/students")
    public String addStudent(@ModelAttribute data student, Model model, RedirectAttributes redirectAttributes) {
        if (studservice.existsByRollNumber(student.getRollNumber())) {
            redirectAttributes.addFlashAttribute("rollError", "Roll number already exists!");
            return "redirect:/students#add"; // Use redirect to avoid resubmission on refresh
        }
        studservice.saveStudent(student);
        return "redirect:/students";
    }


    // 2. Show all students
    @GetMapping("/students")
    public String getStudents(Model model, @ModelAttribute("rollError") String rollError) {
        model.addAttribute("students", studservice.listAllStudents());
        model.addAttribute("student", new data());  // For the Add Student modal
        model.addAttribute("rollError", rollError); // <- this line ensures it’s passed
        return "students";
    }


    // 3. Update student by ID
    @PostMapping("/students/{id}")
    public String updateStudent(@ModelAttribute("student") data updatedStudent) {
        studservice.saveStudent(updatedStudent);
        return "redirect:/students";
    }

    // 4. Find student by roll number

    @GetMapping("/students/find")
    public String findStudentByRoll(@RequestParam String rollNumber, Model model) {
        data student = studservice.findStudentByRollNumber(rollNumber);
        model.addAttribute("students", studservice.listAllStudents());
        model.addAttribute("student", new data());

        if (student != null) {
            model.addAttribute("foundStudent", student);
        } else {
            model.addAttribute("notFound", true);
        }

        return "students";
    }
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id, RedirectAttributes redirectAttributes) {
        studservice.deleteStudent(id);
        redirectAttributes.addFlashAttribute("deleted", true);
        return "redirect:/students";
    }

}
