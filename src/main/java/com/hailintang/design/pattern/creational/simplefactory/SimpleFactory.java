package com.hailintang.design.pattern.creational.simplefactory;

/**
 * @ClassName AbstractFactory
 * @Description TODO
 * @Author DELL
 * @Date 2019/6/27 21:17
 * @Version 1.0
 */
public class SimpleFactory {
//    /**
//     *
//     * @param type
//     * @return
//     */
//    public Vadio getVadio(String type){
//        if(type.equalsIgnoreCase("java")){
//            return new JavaVadio();
//        }else if(type.equalsIgnoreCase("python")){
//            return new PythonVadio();
//        }else{
//            return null;
//        }
//    }

    /**
     * 用反射的方式实现简单工厂
     * @param c
     * @return
     */
    public Vadio getVadioByReflection(Class c){
        Vadio obj = null;
        try {
            obj = (Vadio)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
