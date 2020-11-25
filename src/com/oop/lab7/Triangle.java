package com.oop.lab7;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter()/2 * (getPerimeter()/2 - a) * (getPerimeter()/2 - b) * (getPerimeter()/2 - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String getBiggest() {
        return "Triangle";
    }
}
