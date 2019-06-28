package com.hailintang.design.pattern.creational.simplefactory;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/6/27 21:14
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //方式1：违反开闭原则
//        Vadio vadio = new JavaVadio();
//        vadio.produce();
        //方式2：简单工厂（if-else）
//        AbstractFactory simpleFactory = new AbstractFactory();
//        Vadio vadio = simpleFactory.getVadio("java");
//        if(vadio==null){
//            return;
//        }
//        vadio.produce();

        //方式3：简单工厂（反射）
        SimpleFactory simpleFactory = new SimpleFactory();
        Vadio vadio = simpleFactory.getVadioByReflection(PythonVadio.class);
        vadio.produce();

    }
}
