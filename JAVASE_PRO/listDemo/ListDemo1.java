package com.JAVASE_PRO.listDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("JAVA");
        list.add("JAVA");
        list.add("Mysql");
        list.add("Mysql");
        list.add(2,"HTML");
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.set(1, "高斯林"));
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        System.out.println("------------------------------");
        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i) + " ");
        }
        System.out.println("------------------------------");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------------------");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------------");
        list.forEach(s -> System.out.println(s));


    }
}
