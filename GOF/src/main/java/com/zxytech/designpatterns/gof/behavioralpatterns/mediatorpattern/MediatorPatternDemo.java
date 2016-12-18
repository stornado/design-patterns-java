package com.zxytech.designpatterns.gof.behavioralpatterns.mediatorpattern;

/**
 * Created by ryan on 2016/12/18.
 * 使用 User 对象来显示他们之间的通信。
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi, John!");
        john.sendMessage("Hello, Robert!");
    }
}
