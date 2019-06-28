package com.hailintang.design.pattern.creational.factorymethod;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/6/27 21:14
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new JavaFactory();
        Vadio vadio = abstractFactory.getVadio();
        vadio.produce();
    }
}
