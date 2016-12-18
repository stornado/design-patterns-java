package com.zxytech.designpatterns.gof.structuralpatterns.facadepattern;

/**
 * Created by ryan on 2016/12/18.
 * 使用该外观类画出各种类型的形状。
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
