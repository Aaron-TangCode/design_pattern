package com.hailintang.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @ClassName HungrySingleton
 * @Description 单例模式--饿汉式（无线程安全问题）
 * @Author DELL
 * @Date 2019/7/4 16:04
 * @Version 1.0
 */
public class HungrySingleton implements Serializable {


    private static final HungrySingleton singleton;
    private static final long serialVersionUID = 2389789839637172279L;

    private HungrySingleton(){}

    static {
        singleton = new HungrySingleton();
    }

    public static HungrySingleton getInstance(){
        return singleton;
    }

    /**
     * readResolve方法，如果没这个方法，就反序列化就会破坏单例。
     * 有这个方法，反序列化就不会破坏单例。
     * 这个方法的方法名一定要是：readResovle()
     * @return
     */
    public Object readResolve(){
        return singleton;
    }
}
