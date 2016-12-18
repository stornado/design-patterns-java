package com.zxytech.designpatterns.gof.structuralpatterns.decoratorpattern;

/**
 * Created by ryan on 2016/12/18.
 * 创建扩展了 ShapeDecorator 类的实体装饰类。
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
