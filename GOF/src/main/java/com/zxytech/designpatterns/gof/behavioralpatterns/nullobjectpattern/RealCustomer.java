package com.zxytech.designpatterns.gof.behavioralpatterns.nullobjectpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
