package com.zxytech.designpatterns.gof.behavioralpatterns.strategypattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
