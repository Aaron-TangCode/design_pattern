package com.hailintang.design.pattern.creational.singleton;

/**
 * @ClassName LazySingleton
 * @Description 单例模式（懒汉）
 * @Author DELL
 * @Date 2019/7/4 14:40
 * @Version 1.0
 */
public class LazySingleton {
    private static LazySingleton singleton = null;
    private LazySingleton(){}

    public synchronized static LazySingleton getInstance(){
        if(singleton==null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
