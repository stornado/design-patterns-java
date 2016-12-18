package com.zxytech.designpatterns.javaee.servicelocatorpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class ServiceB implements Service {
    public String getName() {
        return "ServiceB";
    }

    public void execute() {
        System.out.println("Executing ServiceB.");
    }
}
