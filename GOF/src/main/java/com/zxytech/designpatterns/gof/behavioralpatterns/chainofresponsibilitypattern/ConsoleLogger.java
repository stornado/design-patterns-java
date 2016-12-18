package com.zxytech.designpatterns.gof.behavioralpatterns.chainofresponsibilitypattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger::write(): " + message);
    }
}
