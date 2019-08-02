package com.hailintang.design.pattern.structure.bridge.v2;

/**
 * @ClassName Appearance
 * @Description TODO
 * @Author DELL
 * @Date 2019/8/1 22:02
 * @Version 1.0
 */
public interface Appearance {
    public void show();
}
class Loser implements Appearance{

    @Override
    public void show() {
        System.out.println("展示屌丝形象");
    }
}
class TRH implements Appearance{

    @Override
    public void show() {
        System.out.println("展示高富帅形象");
    }
}