package com.zxytech.designpatterns.gof.behavioralpatterns.visitorpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    public void acceppt(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].acceppt(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
