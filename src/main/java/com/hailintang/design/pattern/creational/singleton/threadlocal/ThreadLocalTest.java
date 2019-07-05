package com.hailintang.design.pattern.creational.singleton.threadlocal;




import java.lang.reflect.Field;

public class ThreadLocalTest {
    public static void main(String[] args) throws InterruptedException, NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        ThreadLocal<Person> df = new ThreadLocal<Person>();
        ThreadLocal<Person2> df2 = new ThreadLocal<Person2>();
        ThreadLocal<Person2> df3 = new ThreadLocal<Person2>();
        Person2 person2 = new Person2("2");
        df.set(new Person("1"));
        System.out.println(df.get().getName());
        df2.set(person2);
        df3.set(person2);
        Class<?> aClass = Class.forName("java.lang.Thread");
        Field f = aClass.getDeclaredField("threadLocals");
        f.setAccessible(true);

        Class aClass1 = Class.forName("java.lang.ThreadLocal$ThreadLocalMap");

        System.out.println(aClass1);
        Field threadLocals = aClass.getDeclaredField("threadLocals");
        System.out.println(threadLocals);

        Field size = aClass1.getDeclaredField("size");
        size.setAccessible(true);

        System.out.println("============"+size.get(f.get(Thread.currentThread())));

//        System.out.println(aClass1.cast(o));
//        Target target = new Target(df);
//        Thread thread = new Thread(target);
//
//        thread.start();    //创建一个线程，改变线程中共享变量的值
//        thread.join();  //等待线程执行完毕
//        //主线程访问共享变量，发现Person的值被改变
//         System.out.println("线程" + Thread.currentThread().getName() + "中共享变量Person的名字：" + df.get().getName());
    }      
}

class Target implements Runnable {
    ThreadLocal<Person> df;
    private static Person person = new Person("张三");
    public Target(ThreadLocal<Person> df) {
        this.df =df;
    }

    @Override
    public void run() {
        //线程中创建一个ThreadLocal变量，并将共享变量创建一个本线程副本
//        ThreadLocal<Person> df = new ThreadLocal<Person>();
//        df.set(person);
        //对本线程副本中的值进行改变
        df.get().setName("李四");
        System.out.println("线程" + Thread.currentThread().getName() + "更改ThreadLocal中Person的名字为：" + df.get().getName());

    }

    public Person getPerson() {
        return person;
    }
}

class Person {
    private String name;
    Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Person2 {
    private String name;
    Person2(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}