package com.hailintang.design.pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseCatalog
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/31 17:07
 * @Version 1.0
 */
public class CourseCatalog extends CourseComponent {
    private List<CourseComponent> componentList;
    private String name;
    private int level;

    public CourseCatalog(String name,int level) {
        this.name = name;
        this.level = level;
        componentList = new ArrayList<>();
    }

    @Override
    public void add(CourseComponent courseComponent) {
        componentList.add(courseComponent);
    }

    @Override
    public void remove(CourseComponent courseComponent) {
        componentList.remove(courseComponent);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for(CourseComponent courseComponent : componentList){
            for(int i=0;i<level;i++){
                System.out.print(" ");
            }
            courseComponent.print();
        }
    }
}
