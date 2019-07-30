package com.hailintang.design.pattern.structure.decorator.v1;

/**
 * @ClassName BatterCakeWithEggWithSausage
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 10:42
 * @Version 1.0
 */
public class BatterCakeWithEggWithSausage extends BatterCakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
