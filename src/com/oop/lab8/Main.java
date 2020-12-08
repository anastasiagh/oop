package com.oop.lab8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cub cub = new Cub(4);
        Sphere sphere = new Sphere(1);
        Parallelepiped parallelepiped = new Parallelepiped(3, 4, 6);

        ArrayList<GeometricBody> objects = new ArrayList<GeometricBody>();
        objects.add(cub);
        objects.add(sphere);
        objects.add(parallelepiped);

        GeometricBodyController figureController = new GeometricBodyController();

        System.out.println("Biggest Surface: " + figureController.getBiggestSurface(objects).getBiggest());
        System.out.println("Biggest Volume: " + figureController.getBiggestVolume(objects).getBiggest());

    }
}
