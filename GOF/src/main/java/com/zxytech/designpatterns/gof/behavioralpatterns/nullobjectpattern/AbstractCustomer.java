package com.zxytech.designpatterns.gof.behavioralpatterns.nullobjectpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public abstract class AbstractCustomer {
    protected String name;

    public abstract boolean isNil();

    public abstract String getName();
}
