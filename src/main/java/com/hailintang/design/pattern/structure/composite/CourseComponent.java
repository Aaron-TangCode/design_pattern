package com.hailintang.design.pattern.structure.composite;

/**
 * @ClassName CourseComponent
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/31 16:54
 * @Version 1.0
 */
public abstract class CourseComponent {
    public void add(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持增加操作");
    }

    public void remove(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持移除操作");
    }

    public String getName(){
        throw new UnsupportedOperationException("不支持获取名字操作");
    }

    public double getPrice(){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
