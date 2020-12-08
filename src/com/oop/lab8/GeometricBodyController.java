package com.oop.lab8;

import java.util.ArrayList;

public class GeometricBodyController {

    static public GeometricBody getBiggestSurface(ArrayList<GeometricBody> objects){
        double max = 0;
        GeometricBody maxGeometricBody = null;
        for (GeometricBody geometricBody : objects) {
            double surface = geometricBody.getSurface();
            if (surface > max) {
                max = surface;
                maxGeometricBody = geometricBody;
            }
        }
        return maxGeometricBody;
    }

    static public GeometricBody getBiggestVolume(ArrayList<GeometricBody> objects){
        double max = 0;
        GeometricBody maxGeometricBody = null;
        for (GeometricBody geometricBody : objects) {
            double volume = geometricBody.getVolume();
            if (volume > max) {
                max = volume;
                maxGeometricBody = geometricBody;
            }
        }
        return maxGeometricBody;
    }
}
