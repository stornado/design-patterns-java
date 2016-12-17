package com.zxytech.designpatterns.gof.creationalpatterns.builderpattern;

/**
 * Created by ryan on 2016/12/17.
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
