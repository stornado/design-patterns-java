package com.zxytech.designpatterns.gof.structuralpatterns.facadepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
