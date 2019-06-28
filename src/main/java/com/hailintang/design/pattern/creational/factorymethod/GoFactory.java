package com.hailintang.design.pattern.creational.factorymethod;

/**
 * @ClassName GoFactory
 * @Description TODO
 * @Author DELL
 * @Date 2019/6/28 10:34
 * @Version 1.0
 */
public class GoFactory extends AbstractFactory {
    @Override
    public Vadio getVadio() {
        return new GoVadio();
    }
}
