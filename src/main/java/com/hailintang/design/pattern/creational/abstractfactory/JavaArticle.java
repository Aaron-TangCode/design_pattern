package com.hailintang.design.pattern.creational.abstractfactory;

/**
 * @ClassName JavaArticle
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/2 10:25
 * @Version 1.0
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("java源码");
    }
}
