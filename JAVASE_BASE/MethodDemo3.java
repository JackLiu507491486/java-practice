package com.JAVASE_BASE;

/**
 * 利用方法调用实现数组求最值
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        int arr[] = {10,20,3,50,1,3,5,7};
        System.out.println("数组的最大值:" + getArrayMaxData(arr));
    }

    public static int getArrayMaxData(int []arr){
        int max = arr[0];
        for(int i = 1;i < arr.length;i++)
            if(max < arr[i])    max = arr[i];
        return max;

    }
}
