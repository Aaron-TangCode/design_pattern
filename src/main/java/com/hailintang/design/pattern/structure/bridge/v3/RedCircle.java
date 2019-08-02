package com.hailintang.design.pattern.structure.bridge.v3;

/**
 * @ClassName RedCircle
 * @Description TODO
 * @Author DELL
 * @Date 2019/8/2 10:31
 * @Version 1.0
 */
public class RedCircle implements DrawAPI {


    @Override
    public void drawAPI(int x, int y, int radius) {
        System.out.println("color:red\tx="+x+"\ty="+y+"\tradius="+radius);
    }
}
