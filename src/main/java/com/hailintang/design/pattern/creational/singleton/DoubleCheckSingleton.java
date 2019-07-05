package com.hailintang.design.pattern.creational.singleton;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @ClassName DoubleCheckSingleton
 * @Description DCL
 * @Author DELL
 * @Date 2019/7/4 15:23
 * @Version 1.0
 */
public class DoubleCheckSingleton {
    private  volatile static  DoubleCheckSingleton singleton = null;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if(singleton==null){
           synchronized (DoubleCheckSingleton.class){
               if(singleton==null){
                   singleton = new DoubleCheckSingleton();
                   //singleton = new DoubleCheckSingleton();实际有三部操作
                   //1、分配内存空间
                   //2、初始化对象
                   //3、singleton指向内存空间
                   //2和3可能会因为重排序。因此需要加volatile
               }
           }
        }
        return singleton;
    }
}
