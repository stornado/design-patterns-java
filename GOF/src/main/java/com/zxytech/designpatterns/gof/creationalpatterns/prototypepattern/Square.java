package com.zxytech.designpatterns.gof.creationalpatterns.prototypepattern;

/**
 * Created by ryan on 2016/12/17.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
