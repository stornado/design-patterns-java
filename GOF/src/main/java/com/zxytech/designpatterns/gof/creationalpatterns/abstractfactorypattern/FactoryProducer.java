package com.zxytech.designpatterns.gof.creationalpatterns.abstractfactorypattern;

/**
 * Created by ryan on 2016/12/17.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShaeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
