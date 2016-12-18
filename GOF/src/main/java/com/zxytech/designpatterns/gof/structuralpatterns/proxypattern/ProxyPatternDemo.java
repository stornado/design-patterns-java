package com.zxytech.designpatterns.gof.structuralpatterns.proxypattern;

/**
 * Created by ryan on 2016/12/18.
 * 当被请求时，使用 ProxyImage 来获取 RealImage 类的对象。
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        System.out.println("图像将从磁盘加载");
        image.display();

        System.out.println("\n图像将无法从磁盘加载:");
        image.display();
    }
}
