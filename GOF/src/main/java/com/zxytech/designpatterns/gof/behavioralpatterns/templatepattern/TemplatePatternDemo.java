package com.zxytech.designpatterns.gof.behavioralpatterns.templatepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
