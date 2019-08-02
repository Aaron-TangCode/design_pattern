package com.hailintang.design.pattern.structure.bridge.v3;

/**
 * @ClassName GreenCircle
 * @Description TODO
 * @Author DELL
 * @Date 2019/8/2 10:34
 * @Version 1.0
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawAPI(int x, int y, int radius) {
        System.out.println("color:green\tx="+x+"\ty="+y+"\tradius="+radius);
    }
}
