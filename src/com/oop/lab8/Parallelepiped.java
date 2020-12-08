package com.oop.lab8;

public class Parallelepiped implements GeometricBody{
    private double l;
    private double w;
    private double h;

    Parallelepiped(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    @Override
    public double getSurface() {
        return 2 * (l * w  +  l * h  +  w * h);
    }

    @Override
    public double getVolume() {
        return l * w * h;
    }

    @Override
    public String getBiggest() {
        return "Parallelepiped";
    }
}
