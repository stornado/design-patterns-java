package com.zxytech.designpatterns.javaee.compositeentitypattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();

        client.setData("Second Test", "Another Data");
        client.printData();
    }
}
