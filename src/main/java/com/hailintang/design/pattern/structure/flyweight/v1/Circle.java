package com.hailintang.design.pattern.structure.flyweight.v1;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/31 14:50
 * @Version 1.0
 */
public class Circle implements Shape {
    private int x;
    private int y;
    private int radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
