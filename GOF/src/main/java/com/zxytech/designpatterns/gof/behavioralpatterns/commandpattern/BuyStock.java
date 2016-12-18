package com.zxytech.designpatterns.gof.behavioralpatterns.commandpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.buy();
    }
}
