package com.zxytech.designpatterns.gof.behavioralpatterns.visitorpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class Monitor implements ComputerPart {
    public void acceppt(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
