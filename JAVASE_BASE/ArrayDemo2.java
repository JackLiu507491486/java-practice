package com.JAVASE_BASE;

/**
 * 数组求元素最大值
 * 案例分析：求15、10000、20000、9500、-5的最大值最小值
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int arr[] = {15,10000,20000,9500,-5};
        int max = arr[0], min = arr[0];
        for (int i  = 1;i < arr.length;i++){
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }
        System.out.println("数组的最大值："+max + "数组的最小值：" + min);
    }
}
