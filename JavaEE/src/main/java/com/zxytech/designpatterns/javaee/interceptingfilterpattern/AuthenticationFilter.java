package com.zxytech.designpatterns.javaee.interceptingfilterpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
