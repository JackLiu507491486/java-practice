package com.JAVASE_PRO.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //自定义排序规则
        //Arrays.sort默认升序
        int[] arr = {15,59,71,-5,98};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] arr1 = {15,59,71,-5,98};

        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //指定比较规则 降序
                return -(o1-o2);
            }
        });
        System.out.println(Arrays.toString(arr1));
    }
}
