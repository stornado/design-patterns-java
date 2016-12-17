package com.zxytech.designpatterns.gof.creationalpatterns.factorypattern;

/**
 * Created by ryan on 2016/12/17.
 * 使用该工厂，通过传递类型信息来获取实体类的对象。
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // 获取Circle的对象，并调用他的draw方法
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
