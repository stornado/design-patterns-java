package com.zxytech.designpatterns.gof.structuralpatterns.adapterpattern;

/**
 * Created by ryan on 2016/12/17.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    public void playMp4(String fileName) {
        // 什么也不做
    }
}
