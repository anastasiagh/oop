package com.oop.lab6;

public class Staff extends Person{
    Date joined;
    String[] education;
    String[] certification;
    String[] languages;

    public Staff(Person person, Date joined, String[] education, String[] certification, String[] languages){
        super(person);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }
}
