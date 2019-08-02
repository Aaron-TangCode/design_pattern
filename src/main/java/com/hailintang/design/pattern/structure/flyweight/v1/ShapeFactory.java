package com.hailintang.design.pattern.structure.flyweight.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ShapeFactory
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/31 14:52
 * @Version 1.0
 */
public class ShapeFactory {
    private Map<String,Shape> shapeMap = new HashMap<>();

    /**
     * 根据颜色获取不同的circle
     * @param color
     * @return
     */
    public Circle getShape(String color){
        Circle circle = (Circle)shapeMap.get(color);
        if(circle==null){
            circle = new Circle(color);
            shapeMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
