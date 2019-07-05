package com.hailintang.design.pattern.creational.abstractfactory;

/**
 * @ClassName PythonFactory
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/2 10:29
 * @Version 1.0
 */
public class PythonFactory implements AbstractFactory {
    @Override
    public Course getCourse() {
        return new PythonCourse();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
