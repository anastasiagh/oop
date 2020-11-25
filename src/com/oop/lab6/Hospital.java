package com.oop.lab6;

public class Hospital {
    String name;
    Address address;
    Phone phone;
    Department[] departments;

    public Hospital(String name, Address address, Phone phone, Department[] departments){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.departments = departments;
    }
}
