package com.oop.lab7;

import java.util.ArrayList;

public class FigureController {

    static public Figure getBiggestArea(ArrayList<Figure> objects){
        double max = 0;
        Figure maxFigure = null;
        for (Figure figure : objects) {
            double area = figure.getArea();
            if (area > max) {
                max = area;
                maxFigure = figure;
            }
        }
        return maxFigure;
    }

    static public Figure getBiggestPerimeter(ArrayList<Figure> objects){
        double max = 0;
        Figure maxFigure = null;
        for (Figure figure : objects) {
            double area = figure.getPerimeter();
            if (area > max) {
                max = area;
                maxFigure = figure;
            }
        }
        return maxFigure;
    }
}
