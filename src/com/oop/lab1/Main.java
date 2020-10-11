package com.oop.lab1;

public class Main {

    public static void main(String[] args) {
        //task1
        monitor mon1 = new monitor();

        mon1.color = "black";
        mon1.dimensions = "15.6 inch";
        mon1.resolutionwidth = 1920;
        mon1.resolutionheight = 1080;

        monitor mon2 = new monitor();

        mon2.color = "white";
        mon2.dimensions = "13 inch";
        mon2.resolutionwidth = 2304;
        mon2.resolutionheight = 1440;

        if (mon1.resolutionheight * mon1.resolutionwidth > mon2.resolutionheight * mon2.resolutionwidth)
            System.out.println("The first monitor has a bigger resolution\n");
        else
            System.out.println("The second monitor has a bigger resolution\n");

        //task2,3
        student st1 = new student("Ion", 20, 8.7);
        student st2 = new student("Maria", 19, 9.1);
        student st3 = new student("Vasile", 20, 7.6);
        student st4 = new student("Ioana", 18, 7.5);
        student st5 = new student("Ana", 19, 8.0);
        student st6 = new student("Alina", 21, 9.6);
        student st7 = new student("Stefan", 19, 8.1);

        student[] list1 = {st1, st2, st3};
        university UTM = new university("UTM", 1964, list1);
        UTM.showUniversity();
        double averageUTM = UTM.average(list1);
        System.out.println("UTM average media: " + averageUTM);

        student[] list2 = {st4, st5};
        university USM = new university("USM", 1946, list2);
        USM.showUniversity();
        double averageUSM = USM.average(list2);
        System.out.println("USM average media: " + averageUSM);

        student[] list3 = {st6, st7};
        university ASEM = new university("ASEM", 1991, list3);
        ASEM.showUniversity();
        double averageASEM = ASEM.average(list3);
        System.out.println("ASEM average media: " + averageASEM);
    }
}