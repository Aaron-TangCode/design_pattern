package com.hailintang.design.pattern.creational.abstractfactory;

/**
 * @ClassName PythonArticle
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/2 10:25
 * @Version 1.0
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("python源码");
    }
}
