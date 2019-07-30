package com.hailintang.design.pattern.structure.decorator.v2;

/**
 * @ClassName AbstractDecorator
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 10:53
 * @Version 1.0
 */
public class AbstractDecorator extends AbstractBatterCake {
    private AbstractBatterCake abstractBatterCake;

    public AbstractDecorator(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    @Override
    public String getDesc() {
        return abstractBatterCake.getDesc();
    }

    @Override
    public int cost() {
        return abstractBatterCake.cost();
    }
}
