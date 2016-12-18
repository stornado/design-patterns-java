package com.zxytech.designpatterns.javaee.servicelocatorpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("ServiceA");
        service.execute();
        service = ServiceLocator.getService("ServiceB");
        service.execute();
        service = ServiceLocator.getService("ServiceA");
        service.execute();
        service = ServiceLocator.getService("ServiceB");
        service.execute();
    }
}
