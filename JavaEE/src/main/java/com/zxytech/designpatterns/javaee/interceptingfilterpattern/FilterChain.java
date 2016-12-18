package com.zxytech.designpatterns.javaee.interceptingfilterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 2016/12/18.
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
