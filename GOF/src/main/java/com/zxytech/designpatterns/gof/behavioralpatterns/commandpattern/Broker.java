package com.zxytech.designpatterns.gof.behavioralpatterns.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 2016/12/18.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
