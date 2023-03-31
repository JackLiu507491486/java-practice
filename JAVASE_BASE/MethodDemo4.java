package com.JAVASE_BASE;

import java.util.Scanner;

/**
 * 设计一个方法输出任意整型数组的内容要求输出以下格式
 * “该数组内容为:[11,22,33,44,55]”
 */
public class MethodDemo4{
    public static void main(String[] args) {
        print(new int[]{11,22,33,44,55});
        print(new int[]{1,2,3,4,5,6,7,8,9});
        print(new int[]{0});
        print(null);
        print(new int[0]);
        print(new int[]{});
    }

    public static void print(int[] arr){
        if(arr!=null && arr.length >= 0){
            System.out.print("该数组内容为:[");
            for (int i = 0;i < arr.length;i++){
                /*if(i != arr.length-1)   System.out.print(arr[i] + ",");
                else System.out.print(arr[i]);*/
                System.out.print(i != arr.length-1 ? arr[i] + ",":arr[i]);
            }
            System.out.println("]");
        }else{
            System.out.println("数组为空");
        }

    }
}
