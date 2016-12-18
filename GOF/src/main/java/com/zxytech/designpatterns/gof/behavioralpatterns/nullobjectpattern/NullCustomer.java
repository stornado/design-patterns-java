package com.zxytech.designpatterns.gof.behavioralpatterns.nullobjectpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database.";
    }
}
