package com.zxytech.designpatterns.gof.behavioralpatterns.visitorpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public interface ComputerPart {
    public void acceppt(ComputerPartVisitor computerPartVisitor);
}
