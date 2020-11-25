package com.oop.lab7;

public class Square extends Figure{
    private double a;

    Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public String getBiggest() {
        return "Square";
    }
}
