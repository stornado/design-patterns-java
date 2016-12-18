package com.zxytech.designpatterns.gof.structuralpatterns.proxypattern;

/**
 * Created by ryan on 2016/12/18.
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
