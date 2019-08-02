package com.hailintang.design.pattern.structure.composite;

/**
 * @ClassName Course
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/31 17:02
 * @Version 1.0
 */
public class Course extends CourseComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("name:"+name+" price:"+price );
    }
}
