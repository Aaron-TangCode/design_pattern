package com.hailintang.design.pattern.structure.decorator.v2;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 11:07
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        AbstractBatterCake abstractBatterCake = new BatterCake();

        AbstractDecorator decorator = new AbstractDecorator(abstractBatterCake);

        decorator = new EggDecorator(decorator);

        decorator = new EggDecorator(decorator);
        decorator = new SausageDecorator(decorator);

        System.out.println(decorator.getDesc()+"的价格是："+decorator.cost());
    }
}
