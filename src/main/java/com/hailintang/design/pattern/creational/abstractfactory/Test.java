package com.hailintang.design.pattern.creational.abstractfactory;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/2 10:46
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new PythonFactory();
        Article article = factory.getArticle();
        Course course = factory.getCourse();
        article.produce();
        course.produce();
    }
}
