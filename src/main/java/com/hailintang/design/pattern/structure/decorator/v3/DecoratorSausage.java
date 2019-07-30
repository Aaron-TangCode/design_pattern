package com.hailintang.design.pattern.structure.decorator.v3;

/**
 * @ClassName DecoratorSausage
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 21:55
 * @Version 1.0
 */
public class DecoratorSausage extends Decorator {
    public DecoratorSausage(IBatterCake iBatterCake) {
        super(iBatterCake);
    }

    @Override
    public String desc() {
        return super.desc()+"加一根火腿肠";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
