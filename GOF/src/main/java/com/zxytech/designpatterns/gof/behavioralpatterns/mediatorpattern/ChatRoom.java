package com.zxytech.designpatterns.gof.behavioralpatterns.mediatorpattern;

import java.util.Date;

/**
 * Created by ryan on 2016/12/18.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "]: " + message);
    }
}
