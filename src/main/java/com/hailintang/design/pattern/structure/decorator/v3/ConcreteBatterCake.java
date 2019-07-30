package com.hailintang.design.pattern.structure.decorator.v3;

/**
 * @ClassName ConcreteBatterCake
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 21:52
 * @Version 1.0
 */
public class ConcreteBatterCake implements IBatterCake {
    @Override
    public String desc() {
        return "原始煎饼";
    }

    @Override
    public int cost() {
        return 5;
    }
}
