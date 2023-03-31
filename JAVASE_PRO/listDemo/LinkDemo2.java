package com.JAVASE_PRO.listDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("123");
        list.add("java");
        //删除所有java
        //迭代器
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String s = it.next();
//            if("java".equals(s)){
//                //list.remove("java"); 错误作法
//                it.remove();
//            }
//        }
//        System.out.println(list);
        //for循环有漏删的可能
//        for (int i = 0;i < list.size();i++){
//            if(list.get(i).equals("java") ){
//                list.remove("java");
//            }
//        }
//        System.out.println(list);

        for (int i = list.size()-1;i>=0;i--){
            if(list.get(i).equals("java") ){
                list.remove("java");
            }
        }
        System.out.println(list);
        //foreach
//        for (String s : list) {
//            if(s.equals("java")){
//                list.remove("java");
//            }
//        }
//        System.out.println(list);
//        list.forEach(s -> {
//            if(s.equals("java")){
//               list.remove("java");
//            }
//        });
   }
}
