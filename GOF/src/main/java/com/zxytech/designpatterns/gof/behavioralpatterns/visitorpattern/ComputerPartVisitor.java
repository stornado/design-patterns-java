package com.zxytech.designpatterns.gof.behavioralpatterns.visitorpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
