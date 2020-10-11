package com.oop.lab2;

public class Box {
    double height;
    double width;
    double depth;

    //without parameters
    public Box() {
        height = width = depth = 1;
    }

    //one parameter
    public Box(double x){
        height = width = depth = x;
    }

    //3 parameters
    public Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }

    //task 3
    public double area() {
        return (2 * this.height * this.width) + (2 * this.height * this.depth) + (2 * this.width * this.depth);
    }

    public double volume() {
        return this.height * this.width * this.depth;
    }
}
