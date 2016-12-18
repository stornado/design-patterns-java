package com.zxytech.designpatterns.gof.behavioralpatterns.strategypattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
