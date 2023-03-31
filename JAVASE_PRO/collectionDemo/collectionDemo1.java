package com.JAVASE_PRO.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
* 明确collection体系特点
* */
public class collectionDemo1 {
    public static void main(String[] args) {
        //有序 可重复 有索引
        Collection c = new ArrayList();
        c.add("java");
        c.add(1);
        c.add(2.5);
        c.add('a');
        c.add('a');
        c.add(true);
        System.out.println(c);

        //无序 不可重复 无索引
        Collection c1 = new HashSet();
        c1.add("java");
        c1.add(1);
        c1.add(2.5);
        c1.add('a');
        c1.add('a');
        c1.add(true);
        System.out.println(c1);
    }
}
