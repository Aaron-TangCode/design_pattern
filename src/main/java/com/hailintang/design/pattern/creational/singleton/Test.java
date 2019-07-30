package com.hailintang.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/4 14:42
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("Thread runs over");

        //用序列化破坏单例模式
//        HungrySingleton singleton = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("new_file"));
//        oos.writeObject(singleton);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("new_file"));
//        HungrySingleton newSingleton = (HungrySingleton)ois.readObject();
//
//        System.out.println(singleton);
//        System.out.println(newSingleton);
//
//        System.out.println(singleton==newSingleton);

        //用反射破坏单例
//        HungrySingleton singleton = HungrySingleton.getInstance();
//        Class<HungrySingleton> clazz = HungrySingleton.class;
//        Constructor<HungrySingleton> declaredConstructor = clazz.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        HungrySingleton newInstance = declaredConstructor.newInstance();
//
//        System.out.println(singleton);
//        System.out.println(newInstance);
//        System.out.println(singleton==newInstance);

        //用序列化来测试枚举单例
//        EnumInstance instance = EnumInstance.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("new_file"));
//        oos.writeObject(instance);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("new_file"));
//        EnumInstance newInstance = (EnumInstance)ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance==newInstance);


    }
}
