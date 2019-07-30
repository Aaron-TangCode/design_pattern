package com.hailintang.design.pattern.structure.decorator.v2;

/**
 * @ClassName SausageDecorator
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 11:06
 * @Version 1.0
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+"加一条火腿肠";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
