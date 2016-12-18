package com.zxytech.designpatterns.javaee.businessdelegatepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class EJBService implements BusinessService {
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service.");
    }
}
