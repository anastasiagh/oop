package com.oop.lab6;

public class Doctor extends Operations_Staff{
    String[] speciality;
    String[] locations;

    public Doctor(String[] speciality, String[] locations, Person person, Date joined, String[] education, String[] certification, String[] languages){
        super(person, joined, education, certification, languages);
        this.speciality = speciality;
        this.locations = locations;
    }
}
