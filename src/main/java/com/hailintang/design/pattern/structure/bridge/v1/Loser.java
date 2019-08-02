package com.hailintang.design.pattern.structure.bridge.v1;

/**
 * @ClassName Loser
 * @Description TODO
 * @Author DELL
 * @Date 2019/8/1 21:26
 * @Version 1.0
 */
public class Loser extends Soul {
    public Loser(){
        System.out.println("制造一个无技能的屌丝分身");
    }

    public void doAllLikePeople(){
        System.out.println("分身可以像正常人一样做任何事");
    }

    public void show(){
        System.out.println("展示屌丝形象");
    }
}
