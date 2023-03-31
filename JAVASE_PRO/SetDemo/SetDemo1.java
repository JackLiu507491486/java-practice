package com.JAVASE_PRO.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    //HashSet无序 不重复 无索引
    // LinkedHashSet有序 不重复 无索引
    // TreeSet升序 不重复 无索引
    public static void main(String[] args) {
        //HashSet无序 不重复 无索引
        Set sets = new HashSet<>();
        sets.add("HTML");
        sets.add("asd");
        sets.add("java");

        sets.add(1);
        System.out.println(sets.add("asd"));
        System.out.println(sets.add(1));
        System.out.println(sets);
    }

}
