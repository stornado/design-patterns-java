package com.zxytech.designpatterns.gof.structuralpatterns.flyweightpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Circle::draw() [Color: " + color + " x: " + x + " y: " + y + " radius: " + radius + "]");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
