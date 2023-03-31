package com.JAVASE_PRO.genericityDemo;

public class test1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,5,6,7,8,9,5};
        String[] st = {"a","asd","aaa","sss"};
        Double[] d = {3.5,3.6,3.8,3.9,3.2};
        test1.print(arr);
        System.out.println("\n" + "---------------");
        test1.print(st);
        System.out.println("\n" + "---------------");
        test1.print(d);
    }

    public static <T>void print(T[] t){
        for (int i = 0;i < t.length;i++)
        System.out.print(t[i] + " ");
    }
}
