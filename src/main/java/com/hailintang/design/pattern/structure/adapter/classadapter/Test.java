package com.hailintang.design.pattern.structure.adapter.classadapter;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 16:45
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.desc();

        Target target1 = new Adapter();
        target1.desc();
    }
}
