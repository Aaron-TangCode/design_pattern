package com.hailintang.design.pattern.structure.bridge.v2;

/**
 * @ClassName Skills
 * @Description TODO
 * @Author DELL
 * @Date 2019/8/1 21:57
 * @Version 1.0
 */
public interface Skills {
    public void releaseSkills();
}

class InvisibleSkill implements Skills{

    @Override
    public void releaseSkills() {
        System.out.println("释放隐身技能");
    }
}
class VolandSkill implements Skills {

    @Override
    public void releaseSkills() {
        System.out.println("释放飞行技能");
    }
}
class ReadMindSkill implements Skills{

    @Override
    public void releaseSkills() {
        System.out.println("释放读心术技能");
    }
}