package com.hailintang.design.pattern.structure.decorator.v2;

/**
 * @ClassName EggDecorator
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 11:05
 * @Version 1.0
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
