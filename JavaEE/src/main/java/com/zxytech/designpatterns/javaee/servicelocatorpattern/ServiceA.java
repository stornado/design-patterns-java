package com.zxytech.designpatterns.javaee.servicelocatorpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class ServiceA implements Service {
    public String getName() {
        return "ServiceA";
    }

    public void execute() {
        System.out.println("Executing ServiceA.");
    }
}
