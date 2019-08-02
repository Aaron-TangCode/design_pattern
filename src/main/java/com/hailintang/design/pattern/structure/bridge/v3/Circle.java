package com.hailintang.design.pattern.structure.bridge.v3;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author DELL
 * @Date 2019/8/2 10:35
 * @Version 1.0
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawAPI(x,y,radius);
    }
}
