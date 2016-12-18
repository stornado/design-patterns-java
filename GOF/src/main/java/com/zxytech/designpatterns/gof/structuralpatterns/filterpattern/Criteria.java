package com.zxytech.designpatterns.gof.structuralpatterns.filterpattern;

import java.util.List;

/**
 * Created by ryan on 2016/12/18.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
