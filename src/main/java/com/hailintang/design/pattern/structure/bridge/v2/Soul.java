package com.hailintang.design.pattern.structure.bridge.v2;

/**
 * @ClassName Soul
 * @Description TODO
 * @Author DELL
 * @Date 2019/8/1 22:07
 * @Version 1.0
 */
public abstract class Soul {
    private Skills skills;
    private Appearance appearance;

    public void show(){
        appearance.show();
    }

    public void releaseSkills(){
        skills.releaseSkills();
    }

    public void Dopperganger(){
        System.out.println("制作分身");
    }

    public abstract void doAllLikePeople();

    public Soul() {
    }

    public Soul(Skills skills) {
        this.skills = skills;
    }

    public Soul(Appearance appearance) {
        this.appearance = appearance;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public Soul(Skills skills, Appearance appearance) {
        this.skills = skills;
        this.appearance = appearance;
    }
}
class Doppelganger extends Soul{

    public Doppelganger() {
        System.out.println("制作一个没技能没外貌的分身");
    }

    @Override
    public void doAllLikePeople() {
        System.out.println("分身能做任何事");
    }
}
