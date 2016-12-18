package com.zxytech.designpatterns.gof.behavioralpatterns.visitorpattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.acceppt(new ComputerPartDisplayVisitor());
    }
}
