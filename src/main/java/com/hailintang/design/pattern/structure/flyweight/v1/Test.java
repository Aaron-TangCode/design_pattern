package com.hailintang.design.pattern.structure.flyweight.v1;

import java.util.Random;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/31 14:58
 * @Version 1.0
 */
public class Test {
    private static String[] colors = {"Green","Yellow","Blue","Black","Red"};
    public static void main(String[] args) {

       ShapeFactory shapeFactory = new ShapeFactory();
       for(int i=0;i<20;i++){
           Circle circle = shapeFactory.getShape(colors[getRandomColor()]);
           circle.setX(getRandomX());
           circle.setY(getRandomY());
           circle.setRadius(100);
           circle.draw();
       }
    }


    public static int getRandomColor(){
        return (int)(Math.random()*colors.length);
    }
    public static int getRandomX(){
        return (int)(Math.random()*100);
    }
    public static int getRandomY(){
        return (int)(Math.random()*100);
    }
}
