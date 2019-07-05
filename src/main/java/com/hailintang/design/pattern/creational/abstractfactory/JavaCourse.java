package com.hailintang.design.pattern.creational.abstractfactory;

/**
 * @ClassName JavaCourse
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/2 10:26
 * @Version 1.0
 */
public class JavaCourse extends Course {
    @Override
    public void produce() {
        System.out.println("java视频");
    }
}
