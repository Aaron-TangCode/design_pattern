package com.hailintang.design.pattern.creational.factorymethod;

/**
 * @ClassName PythonFactory
 * @Description TODO
 * @Author DELL
 * @Date 2019/6/28 10:24
 * @Version 1.0
 */
public class PythonFactory extends AbstractFactory {
    @Override
    public Vadio getVadio() {
        return new PythonVadio();
    }
}
