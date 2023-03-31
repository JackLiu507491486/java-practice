package com.JAVASE_BASE;

import java.util.ArrayList;

/**
 * 遍历集合中的元素，并删除低于80的
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(98);
        al.add(77);
        al.add(66);
        al.add(89);
        al.add(79);
        al.add(50);
        al.add(60);
        al.add(100);
        System.out.println("现在数组保存:" + al);
        /*
             清除低于80的数据
         */
        /*for (int i = 0;i < al.size();){
            if(al.get(i) >= 80)     i++;
            else     al.remove(i);
        }*/

        for (int i = al.size() - 1;i >= 0;i--)
            if(al.get(i) < 80)  al.remove(i);

        System.out.println("清除后数组保存:" + al);
    }
}
