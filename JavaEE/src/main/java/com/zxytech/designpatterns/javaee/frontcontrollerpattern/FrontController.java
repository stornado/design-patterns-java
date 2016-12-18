package com.zxytech.designpatterns.javaee.frontcontrollerpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    public void dispatchRequest(String request) {
        // 记录每一个请求
        trackRequest(request);
        // 对用户进行身份验证
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }
}
