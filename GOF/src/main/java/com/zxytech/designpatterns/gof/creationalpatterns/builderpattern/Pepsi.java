package com.zxytech.designpatterns.gof.creationalpatterns.builderpattern;

/**
 * Created by ryan on 2016/12/17.
 */
public class Pepsi extends ColdDrink {
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
