package com.hailintang.design.pattern.structure.bridge.v3;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/8/2 10:37
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Shape shape = new Circle(new RedCircle(),1,2,3);
        shape.draw();
        shape.setDrawAPI(new GreenCircle());
        shape.draw();
    }
}
