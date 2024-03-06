package com.leopardruns.crud;

import java.time.LocalDate;

public class User {
    private Integer id;
    private String email;
    private String name;
    private LocalDate dob;
    private String role; //admin moderator user

    public User(Integer id, String email, String name, String dob, String role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.dob = LocalDate.parse(dob);
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", role='" + role + '\'' +
                '}';
    }
}
