package com.hailintang.design.pattern.structure.decorator.v3;

/**
 * @ClassName DecoratorEgg
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 21:54
 * @Version 1.0
 */
public class DecoratorEgg extends Decorator {
    public DecoratorEgg(IBatterCake iBatterCake) {
        super(iBatterCake);
    }

    @Override
    public String desc() {
        return super.desc()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
