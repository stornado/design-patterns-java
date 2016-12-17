package com.zxytech.designpatterns.gof.creationalpatterns.prototypepattern;

/**
 * Created by ryan on 2016/12/17.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
