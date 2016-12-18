package com.zxytech.designpatterns.gof.creationalpatterns.abstractfactorypattern;

/**
 * Created by ryan on 2016/12/17.
 * 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        // 获取形状工厂的Circle对象
        Shape circle = shapeFactory.getShape("Circle");
        // 调用Circle对象的draw方法
        circle.draw();
        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        // 获取颜色为Red的对象
        Color red = colorFactory.getColor("Red");
        // 调用Red对象的fill方法
        red.fill();
        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("Green");

        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor("BLUE");

        //调用 Blue 的 fill 方法
        color3.fill();
    }
}
