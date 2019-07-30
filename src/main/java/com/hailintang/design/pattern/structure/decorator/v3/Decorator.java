package com.hailintang.design.pattern.structure.decorator.v3;

/**
 * @ClassName Decorator
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 21:53
 * @Version 1.0
 */
public abstract class Decorator implements IBatterCake {
    private IBatterCake iBatterCake;

    public Decorator(IBatterCake iBatterCake) {
        this.iBatterCake = iBatterCake;
    }

    @Override
    public String desc() {
        return iBatterCake.desc();
    }

    @Override
    public int cost() {
        return iBatterCake.cost();
    }
}
