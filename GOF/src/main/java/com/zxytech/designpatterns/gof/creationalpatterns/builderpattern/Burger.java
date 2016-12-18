package com.zxytech.designpatterns.gof.creationalpatterns.builderpattern;

/**
 * Created by ryan on 2016/12/17.
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
