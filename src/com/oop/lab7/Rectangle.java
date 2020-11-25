package com.oop.lab7;

public class Rectangle extends Figure{
    private double w;
    private double l;

    Rectangle(double w, double l) {
        this.w = w;
        this.l = l;
    }

   @Override
    public double getArea() {
        return w * l;
    }

    @Override
    public double getPerimeter() {
        return 2 * (w + l);
    }

    @Override
    public String getBiggest() {
        return "Rectangle";
    }
}
