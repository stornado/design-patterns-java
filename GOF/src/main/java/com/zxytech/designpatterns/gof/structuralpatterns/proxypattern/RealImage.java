package com.zxytech.designpatterns.gof.structuralpatterns.proxypattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void display() {
        System.out.println("Displaying Image: " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading Image: " + fileName);
    }
}
