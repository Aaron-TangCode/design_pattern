package com.hailintang.design.pattern.structure.decorator.v3;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 21:56
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        IBatterCake batterCake = new ConcreteBatterCake();
        System.out.println(batterCake.desc()+"的价格是："+batterCake.cost());

        Decorator decorator = new DecoratorEgg(batterCake);
        System.out.println(decorator.desc()+"的价格是："+decorator.cost());

        decorator = new DecoratorSausage(decorator);
        System.out.println(decorator.desc()+"的价格是："+decorator.cost());


    }
}
