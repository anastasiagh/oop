package com.oop.lab8;

class Cub implements GeometricBody{
    private double a;

    Cub(double a) {
        this.a = a;
    }

    public double getSurface() {
        return( 6 * a * a);
    }

    @Override
    public double getVolume() {
        return a * a * a;
    }
    @Override
    public String getBiggest() {
        return "Cub";
    }
}
