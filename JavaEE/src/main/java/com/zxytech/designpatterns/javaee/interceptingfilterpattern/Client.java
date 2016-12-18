package com.zxytech.designpatterns.javaee.interceptingfilterpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
