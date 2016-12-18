package com.zxytech.designpatterns.gof.behavioralpatterns.mementopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 2016/12/18.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
