package com.hailintang.design.pattern.structure.bridge.v1;

/**
 * @ClassName TRH
 * @Description TODO
 * @Author DELL
 * @Date 2019/8/1 21:29
 * @Version 1.0
 */
public class TRH extends Soul {
    public TRH(){
        System.out.println("制造一个无技能的高富帅分身");
    }

    public void doAllLikePeople(){
        System.out.println("分身可以像正常人一样做任何事");
    }

    public void show(){
        System.out.println("展示高富帅形象");
    }
}
class InvisibleLoser extends Loser{

    public InvisibleLoser(){
        System.out.println("制造一个带隐身技能的屌丝分身");
    }

    public void releaseSkills(){
        System.out.println("屌丝分身释放隐身技能");
    }
}
class VolantLoser extends Loser{

    public VolantLoser(){
        System.out.println("制造一个带飞行技能的屌丝分身");
    }

    public void releaseSkills(){
        System.out.println("屌丝分身释放飞行技能");
    }
}
//带有读心术技能的屌丝分身
class ReadMindLoser extends Loser{

    public ReadMindLoser(){
        System.out.println("制造一个带读心术技能的屌丝分身");
    }

    public void releaseSkills(){
        System.out.println("屌丝分身释放读心术技能");
    }
}
//带有隐身技能的高富帅分身
class InvisibleTRH extends TRH{

    public InvisibleTRH(){
        System.out.println("制造一个带隐身技能的高富帅分身");
    }

    public void releaseSkills(){
        System.out.println("高富帅分身释放隐身技能");
    }
}
//带有飞行技能的高富帅分身
class VolantTRH extends TRH{

    public VolantTRH(){
        System.out.println("制造一个带飞行技能的高富帅分身");
    }

    public void releaseSkills(){
        System.out.println("高富帅分身释放飞行技能");
    }
}
//带有读心术技能的高富帅分身
class ReadMindTRH extends TRH{

    public ReadMindTRH(){
        System.out.println("制造一个带读心术技能的高富帅分身");
    }

    public void releaseSkills(){
        System.out.println("高富帅分身释放读心术技能");
    }
}