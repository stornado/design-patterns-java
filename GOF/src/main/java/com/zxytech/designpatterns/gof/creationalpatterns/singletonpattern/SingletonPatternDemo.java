package com.zxytech.designpatterns.gof.creationalpatterns.singletonpattern;

/**
 * Created by ryan on 2016/12/17.
 * 从 singleton 类获取唯一的对象。
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        // 不合法的构造函数
        // 编译时错误：构造函SingleObject()是不可兼得
        // SingleObject object = new SingleObject();

        // 获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        // 显示消息
        object.showMessage();

        // 单例模式的几种实现方式
        // 1、懒汉式，线程不安全
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        singletonLazy.showMessage();

        // 2、懒汉式，线程安全
        SingletonLazySync singletonLazySync = SingletonLazySync.getInstance();
        singletonLazySync.showMessage();

        // 3、饿汉式
        SingletonClassloader singletonClassloader = SingletonClassloader.getInstance();
        singletonClassloader.showMessage();

        // 4、双检锁/双重校验锁（DCL，即 double-checked locking）
        SingletonDCL singletonDCL = SingletonDCL.getInstance();
        singletonDCL.showMessage();

        // 5、登记式/静态内部类
        SingletonInside singletonInside = SingletonInside.getInstance();
        singletonInside.showMessage();

        // 6、枚举
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.showMessage();
    }
}
