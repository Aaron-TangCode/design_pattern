package com.hailintang.design.pattern.structure.bridge.v1;

public class Use {

    public static void main(String[] args) {
        InvisibleLoser invisibleLoser = new InvisibleLoser();
        invisibleLoser.releaseSkills();
        System.out.println("------------------------------------");
        ReadMindTRH readMindTRH = new ReadMindTRH();
        readMindTRH.releaseSkills();
        System.out.println("------------------------------------");
        InvisibleTRH invisibleTRH = new InvisibleTRH();
        invisibleTRH.releaseSkills();
    }
    
}