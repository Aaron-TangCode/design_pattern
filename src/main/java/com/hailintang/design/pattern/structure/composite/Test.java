package com.hailintang.design.pattern.structure.composite;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/31 17:19
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Course linuxCourse = new Course("linux课程",11);
        Course windowsCourse = new Course("windows课程",22);

        CourseCatalog javaCourseCatalog = new CourseCatalog("java课程目录",2);

        Course course1 = new Course("java课程1",10);
        Course course2 = new Course("java课程2",10);
        Course course3 = new Course("java课程3",10);

        javaCourseCatalog.add(course1);
        javaCourseCatalog.add(course2);
        javaCourseCatalog.add(course3);

        CourseCatalog mainCourseCatalog = new CourseCatalog("主课程目录",1);

        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();
    }
}
