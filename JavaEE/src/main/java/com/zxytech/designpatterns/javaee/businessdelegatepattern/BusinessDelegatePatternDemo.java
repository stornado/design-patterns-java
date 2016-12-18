package com.zxytech.designpatterns.javaee.businessdelegatepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args){
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
