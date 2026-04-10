package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.User;

import java.time.LocalDate;
import java.util.Random;

public class medical_officer_dashboard extends User {

    private int status ; // status == 2 pending, 1 == accepted , 2 == rejected

    public medical_officer_dashboard(String name, String email, String phoneNum, String address, String gender, String password, LocalDate dob) {
        super(name, email, phoneNum, address, gender, password, dob);
        this.setId(this.generateID());
        this.status = 2;
    }

    @Override
    public String generateID() {
        String id = " ";

        Random random = new Random();
        id = Integer.toString(random.nextInt(1000000, 9999999));


        return id ;
    }

    @Override
    public boolean login(String id, String password) {
        return false;
    }



}
