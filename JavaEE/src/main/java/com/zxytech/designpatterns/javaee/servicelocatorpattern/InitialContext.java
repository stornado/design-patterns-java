package com.zxytech.designpatterns.javaee.servicelocatorpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class InitialContext {
    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICEA")) {
            System.out.println("Looking up and creating a new ServiceA object.");
            return new ServiceA();
        } else if (jndiName.equalsIgnoreCase("SERVICEB")) {
            System.out.println("Looking up and creating a new ServiceB object.");
            return new ServiceB();
        }
        return null;
    }
}
