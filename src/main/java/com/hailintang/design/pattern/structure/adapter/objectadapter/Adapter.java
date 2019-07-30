package com.hailintang.design.pattern.structure.adapter.objectadapter;

/**
 * @ClassName Adapter
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 16:46
 * @Version 1.0
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void desc() {
        adaptee.say();
    }
}
