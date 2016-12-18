package com.zxytech.designpatterns.gof.creationalpatterns.builderpattern;

/**
 * Created by ryan on 2016/12/17.
 * 创建扩展了 Burger 和 ColdDrink 的实体类。
 */
public class VegBurger extends Burger {
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
