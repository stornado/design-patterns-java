package com.zxytech.designpatterns.gof.structuralpatterns.decoratorpattern;

/**
 * Created by ryan on 2016/12/18.
 * 使用 RedShapeDecorator 来装饰 Shape 对象。
 */
public class DecoratorPatternDemo {
    public static void main(String[] args){
        Shape circle = new Circle();
        Shape redCircle=new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border:");
        circle.draw();

        System.out.println("\nCircle with red border:");
        redCircle.draw();

        System.out.println("\nRectangle with red border:");
        redRectangle.draw();
    }
}
