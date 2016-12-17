package com.zxytech.designpatterns.gof.creationalpatterns.prototypepattern;

/**
 * Created by ryan on 2016/12/17.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
