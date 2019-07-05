package com.hailintang.design.pattern.creational.abstractfactory;

/**
 * @ClassName PythonCourse
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/2 10:26
 * @Version 1.0
 */
public class PythonCourse extends Course{
    @Override
    public void produce() {
        System.out.println("python视频");
    }
}
