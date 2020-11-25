package com.oop.lab7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Figure circle = new Figure() {
           double radius = 4;

           @Override
           public double getArea() {
               return Math.PI * radius * radius;
           }

           @Override
           public double getPerimeter() {
               return 2 * Math.PI * radius;
           }

            @Override
            public String getBiggest() {
                return "Circle";
            }
       };

        Figure square = new Square(5);
        Figure rectangle = new Rectangle(9,11);
        Figure triangle = new Triangle(7,5,8);

        ArrayList<Figure> objects = new ArrayList<Figure>();
        objects.add(square);
        objects.add(rectangle);
        objects.add(triangle);
        objects.add(circle);

        FigureController figureController = new FigureController();

        System.out.println("Biggest Area: " + figureController.getBiggestArea(objects).getBiggest());
        System.out.println("Biggest Perimeter: " + figureController.getBiggestPerimeter(objects).getBiggest());

        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter());


    }
}
