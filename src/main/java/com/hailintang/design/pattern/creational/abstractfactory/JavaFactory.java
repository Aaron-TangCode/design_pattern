package com.hailintang.design.pattern.creational.abstractfactory;

/**
 * @ClassName JavaFactory
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/2 10:28
 * @Version 1.0
 */
public class JavaFactory implements AbstractFactory {
    @Override
    public Course getCourse() {
        return new JavaCourse();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
