package com.hailintang.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ContainerSingleton
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/5 11:30
 * @Version 1.0
 */
public class ContainerSingleton {
    private static Map<String,Object> singletonMap = new HashMap<>();

    private ContainerSingleton(){}

    public static void putInstance(String key,Object obj){
        singletonMap.put(key,obj);
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
