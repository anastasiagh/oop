package com.oop.lab6;

public class Patient extends Person{
    String id;
    Integer age;
    Date accepted;
    History sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;
    Operations_Staff[] operations_staff;

    public Patient(Person person, String id, Integer age, Date accepted, History sickness, String[] prescriptions, String[] allergies, String[] specialReqs, Operations_Staff[] operations_staff){
        super(person);
        this.id = id;
        this.age = age;
        this.accepted = accepted;
        this.sickness = sickness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }
}
