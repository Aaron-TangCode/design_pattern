package com.hailintang.design.pattern.creational.singleton;

/**
 * @ClassName T
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/4 14:43
 * @Version 1.0
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

//        DoubleCheckSingleton singleton = DoubleCheckSingleton.getInstance();

//        ContainerSingleton.putInstance("object",new Object());
//        Object singleton = ContainerSingleton.getInstance("object");
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+singleton);
    }
}
