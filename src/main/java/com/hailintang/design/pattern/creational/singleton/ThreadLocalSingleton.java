package com.hailintang.design.pattern.creational.singleton;

/**
 * @ClassName ThreadLocalSingleton
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/5 11:57
 * @Version 1.0
 */
public class ThreadLocalSingleton {

    private static ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}
    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingletonThreadLocal.get();
    }
}
