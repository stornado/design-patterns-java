package com.zxytech.designpatterns.gof.structuralpatterns.flyweightpattern;

import java.util.HashMap;

/**
 * Created by ryan on 2016/12/18.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
