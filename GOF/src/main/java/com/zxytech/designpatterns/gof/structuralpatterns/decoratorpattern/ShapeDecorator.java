package com.zxytech.designpatterns.gof.structuralpatterns.decoratorpattern;

/**
 * Created by ryan on 2016/12/18.
 * 创建实现了 Shape 接口的抽象装饰类。
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
