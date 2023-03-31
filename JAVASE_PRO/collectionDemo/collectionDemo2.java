package com.JAVASE_PRO.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList();
        list.add("JAVA");
        list.add("C");
        list.add("C++");
        list.add("C#");
//        用迭代器遍历
//        Iterator<String> it = list.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        //foreach遍历
        for (String s : list) {
            System.out.println(s);
        }
        //lambda遍历
        list.forEach(s -> System.out.println(s));



    }
}
