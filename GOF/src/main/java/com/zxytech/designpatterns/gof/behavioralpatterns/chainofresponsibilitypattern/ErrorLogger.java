package com.zxytech.designpatterns.gof.behavioralpatterns.chainofresponsibilitypattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger::write(): " + message);
    }
}
