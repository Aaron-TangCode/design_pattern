package com.hailintang.design.pattern.creational;

import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestCol
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/17 10:28
 * @Version 1.0
 */
public class TestCol {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(0));
        list.remove(1);
        System.out.println(list.get(1));

    }
}
