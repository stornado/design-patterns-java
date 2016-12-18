package com.zxytech.designpatterns.gof.structuralpatterns.bridgepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
