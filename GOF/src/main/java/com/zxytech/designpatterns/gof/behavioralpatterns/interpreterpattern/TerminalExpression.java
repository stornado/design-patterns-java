package com.zxytech.designpatterns.gof.behavioralpatterns.interpreterpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
