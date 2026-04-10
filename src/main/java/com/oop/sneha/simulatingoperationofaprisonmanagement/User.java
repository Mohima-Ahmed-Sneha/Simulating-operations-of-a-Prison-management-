package com.oop.sneha.simulatingoperationofaprisonmanagement;

import java.time.LocalDate;

public abstract class User {
    private String id, name, phoneNum, email, address, gender, password;
    private LocalDate dob, doj;

    public User(String name, String email, String phoneNum, String address, String gender, String password, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.doj = LocalDate.now();
        this.address = address;
        this.gender = gender;
        this.password = password;
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                ", doj=" + doj +
                '}';
    }

    public abstract String generateID();
    public abstract boolean login(String id, String password);
}
