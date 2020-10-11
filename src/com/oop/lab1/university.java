package com.oop.lab1;

import java.util.ArrayList;

public class university {
    String unName;
    int fyear;
    student[] list;

    public university(String unName, int fyear, student[] studentList) {
        this.unName = unName;
        this.fyear = fyear;
        this.list = studentList;
    }

    public void showUniversity() {
        System.out.println(this.unName);
        System.out.println(this.fyear);
        for (student element : list) {
            System.out.println(element.name);
        }
    }

    public double average(student[] list) {
        double total = 0;
        double ave;
        for (student element : list) {
            total = total + element.mark;
        }
        ave = total / list.length;
        return ave;
    }

   // public void addstudent(student st){
     //   this.students.add(st);
    //}

}
