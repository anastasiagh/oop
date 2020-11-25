package com.oop.lab6;

public class Person {
    String title, givenName, middleName, familyName;
    private FullName name;
    Date birthDate;
    Gender gender;
    Address homeAddress;
    Phone phone;

    public Person(String title, String givenName, String middleName, String familyName, Date birthDate, Gender gender, Address homeAddress, Phone phone){
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = new FullName(givenName, middleName, familyName);
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
    }

    Person(Person person){
        this.title = person.title;
        this.givenName = person.givenName;
        this.middleName = person.middleName;
        this.familyName = person.familyName;
        this.name = new FullName(givenName, middleName, familyName);
        this.birthDate = person.birthDate;
        this.gender = person.gender;
        this.homeAddress = person.homeAddress;
        this.phone = person.phone;
    }
}
