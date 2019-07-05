package com.hailintang.design.pattern.creational.singleton;

/**
 * @ClassName EnumInstance
 * @Description 单例模式-枚举
 * @Author DELL
 * @Date 2019/7/5 10:00
 * @Version 1.0
 */
public enum EnumInstance{
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
