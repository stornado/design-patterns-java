package com.zxytech.designpatterns.javaee.interceptingfilterpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class InterceptingFilterPatternDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
