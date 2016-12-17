package com.zxytech.designpatterns.gof.creationalpatterns.singletonpattern;

/**
 * Created by ryan on 2016/12/17.
 */

//4、双检锁/双重校验锁（DCL，即 double-checked locking）
//        JDK 版本：JDK1.5 起
//        是否 Lazy 初始化：是
//        是否多线程安全：是
//        实现难度：较复杂
//        描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
//        getInstance() 的性能对应用程序很关键。

public class SingletonDCL {
    private volatile static SingletonDCL instance;

    private SingletonDCL() {
    }

    public static SingletonDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Inside SingletonDCL::showMessage() method.");
    }
}
