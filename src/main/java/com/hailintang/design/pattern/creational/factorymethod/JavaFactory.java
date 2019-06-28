package com.hailintang.design.pattern.creational.factorymethod;

/**
 * @ClassName JavaFactory
 * @Description TODO
 * @Author DELL
 * @Date 2019/6/28 10:23
 * @Version 1.0
 */
public class JavaFactory extends AbstractFactory {

    @Override
    public Vadio getVadio() {
        return new JavaVadio();
    }

}
