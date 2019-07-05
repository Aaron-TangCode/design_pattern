package com.hailintang.design.pattern.creational.singleton;

/**
 * @ClassName StaticInnerClassSingleton
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/4 15:33
 * @Version 1.0
 */
public class StaticInnerClassSingleton {

    private static class InnerClass{
       private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.singleton;
    }
}
