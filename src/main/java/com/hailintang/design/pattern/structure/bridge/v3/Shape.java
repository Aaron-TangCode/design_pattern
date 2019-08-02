package com.hailintang.design.pattern.structure.bridge.v3;

/**
 * @ClassName Shape
 * @Description TODO
 * @Author DELL
 * @Date 2019/8/2 10:29
 * @Version 1.0
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();


    public DrawAPI getDrawAPI() {
        return drawAPI;
    }

    public void setDrawAPI(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
}
