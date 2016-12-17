package com.zxytech.designpatterns.gof.creationalpatterns.builderpattern;

/**
 * Created by ryan on 2016/12/17.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
