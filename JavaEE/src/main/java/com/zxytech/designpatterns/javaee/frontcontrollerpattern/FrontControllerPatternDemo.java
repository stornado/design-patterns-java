package com.zxytech.designpatterns.javaee.frontcontrollerpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("Home");
        frontController.dispatchRequest("Student");
    }
}
