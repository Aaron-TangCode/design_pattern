package com.hailintang.design.pattern.structure.decorator.v2;

/**
 * @ClassName BatterCake
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 10:50
 * @Version 1.0
 */
public class BatterCake extends AbstractBatterCake {
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
