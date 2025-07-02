package com.management.Student_Management_System;

import jakarta.persistence.*;

@Entity
@Table(name = "student-data")
public class data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "roll_number",nullable = false, unique = true)
    private String rollNumber;
    @Column(name = "first_Name",nullable = false)
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "phone",nullable = false)
    private String phone;
    @Column(name = "age",nullable = false)
    private int age;

    public data() {

    }

    public data(String firstName, String lastName, int age, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getRollNumber() { return rollNumber; }

    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
