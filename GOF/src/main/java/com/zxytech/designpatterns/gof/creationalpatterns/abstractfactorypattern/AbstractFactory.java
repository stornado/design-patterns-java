package com.zxytech.designpatterns.gof.creationalpatterns.abstractfactorypattern;

/**
 * Created by ryan on 2016/12/17.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
