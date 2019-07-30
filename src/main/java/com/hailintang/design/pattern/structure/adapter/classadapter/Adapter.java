package com.hailintang.design.pattern.structure.adapter.classadapter;

/**
 * @ClassName Adapter
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 16:44
 * @Version 1.0
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void desc() {
        super.say();
    }
}
