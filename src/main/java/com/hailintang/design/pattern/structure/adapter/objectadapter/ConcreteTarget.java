package com.hailintang.design.pattern.structure.adapter.objectadapter;

/**
 * @ClassName ConcreteTarget
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 16:48
 * @Version 1.0
 */
public class ConcreteTarget implements Target {
    @Override
    public void desc() {
        System.out.println("目标接口");
    }
}
