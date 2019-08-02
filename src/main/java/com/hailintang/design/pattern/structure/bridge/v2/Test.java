package com.hailintang.design.pattern.structure.bridge.v2;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/8/1 22:15
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Soul soul = new Doppelganger();
        soul.setAppearance(new Loser());
        soul.setSkills(new VolandSkill());

        soul.releaseSkills();
        soul.show();

        System.out.println("-------------------");
        //切换技能和身份
        soul.setSkills(new ReadMindSkill());
        soul.setAppearance(new TRH());
        soul.releaseSkills();
        soul.show();
    }
}
