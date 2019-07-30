package com.hailintang.design.pattern.structure.decorator.v1;

/**
 * @ClassName BatterCakeWithEgg
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/30 10:39
 * @Version 1.0
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
