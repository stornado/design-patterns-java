package com.zxytech.designpatterns.gof.behavioralpatterns.commandpattern;

/**
 * Created by ryan on 2016/12/18.
 * 使用 Broker 类来接受并执行命令。
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
