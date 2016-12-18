package com.zxytech.designpatterns.javaee.interceptingfilterpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
