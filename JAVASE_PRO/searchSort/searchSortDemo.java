package com.JAVASE_PRO.searchSort;

import java.util.Arrays;

public class searchSortDemo {
    public static void main(String[] args) {
        int[] a = {5,1,3,2,7,9};
        /*冒泡排序
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j <= a.length - i - 1; j++) {
               int temp;
               if(a[j-1] > a[j]){
                   temp = a[j-1];
                   a[j-1] = a[j];
                   a[j] = temp;
               }
            }
        }
        System.out.println(Arrays.toString(a));
        */
        //选择排序
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1;j < a.length;j++){
                int temp;
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
