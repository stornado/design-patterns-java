package com.zxytech.designpatterns.gof.structuralpatterns.bridgepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class GreenCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color: green, radius: " + radius + " x: " + x + " y: " + y + "]");
    }
}
