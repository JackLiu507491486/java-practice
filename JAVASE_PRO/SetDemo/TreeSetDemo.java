package com.JAVASE_PRO.SetDemo;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(23);
        set1.add(55);
        set1.add(78);
        set1.add(0);
        set1.add(15);
        System.out.println(set1);
        Set<Student> set2 = new TreeSet<>();
        Student s1 = new Student("AMY","001",18);
        Student s2 = new Student("AM","002",17);
        Student s3 = new Student("AY","003",19);
        Student s4 = new Student("MY","004",18);
        Student s5 = new Student("AMY","005",18);
        Student s6 = new Student("AMY","001",18);
        set2.add(s1);
        set2.add(s2);
        set2.add(s3);
        set2.add(s4);
        set2.add(s5);
        set2.add(s6);
        System.out.println(set2);


    }
}
