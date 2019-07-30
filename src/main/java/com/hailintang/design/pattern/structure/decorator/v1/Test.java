package com.hailintang.design.pattern.structure.decorator.v1;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 10:42
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc()+"的价格是："+batterCake.cost());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc()+"的价格是："+batterCakeWithEgg.cost());

        BatterCakeWithEggWithSausage batterCakeWithEggWithSausage = new BatterCakeWithEggWithSausage();
        System.out.println(batterCakeWithEggWithSausage.getDesc()+"的价格是："+batterCakeWithEggWithSausage.cost());
    }
}
