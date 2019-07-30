package com.hailintang.design.pattern.structure.adapter.objectadapter;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 16:46
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ConcreteTarget();
        Adapter adapter = new Adapter(adaptee);
    }
}
