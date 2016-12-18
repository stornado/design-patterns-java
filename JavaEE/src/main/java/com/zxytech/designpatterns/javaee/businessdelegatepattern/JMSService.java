package com.zxytech.designpatterns.javaee.businessdelegatepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class JMSService implements BusinessService {
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service.");
    }
}
