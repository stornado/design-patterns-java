package com.zxytech.designpatterns.gof.behavioralpatterns.chainofresponsibilitypattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger::write(): " + message);
    }
}
