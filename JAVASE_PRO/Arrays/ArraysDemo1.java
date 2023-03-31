package com.JAVASE_PRO.Arrays;


import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] arr = {10,2,3,55,100,-5};
        System.out.println(arr);

        //返回数组内容
        System.out.println(Arrays.toString(arr));

        //排序（升序）
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //二分查找（必须排好序,否则有bug）
        int search = Arrays.binarySearch(arr, 55);
        System.out.println(search);

        int search1 = Arrays.binarySearch(arr, 5);
        System.out.println(search1);

    }
}
