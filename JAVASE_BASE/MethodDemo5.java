package com.JAVASE_BASE;

/**
 * 通过方法查找数组元素的下标
 */
public class MethodDemo5 {
    public static void main(String[] args) {
        int []arr = {1,2,32,4,5,65,7,8,9,0,10};
        int []num = {};
        int a1 = getArrayDataIndexes(arr,0);
        int a2 = getArrayDataIndexes(arr,3);
        int b1 = getArrayDataIndexes(num,0);
        System.out.println(a1 != -1 ? (a1 != -2 ? "所查找元素在索引:" + a1 : "该数组为空"):"未找到所查找元素");
        System.out.println(a2 != -1 ? (a2 != -2 ? "所查找元素在索引:" + a1 : "该数组为空"):"未找到所查找元素");
        System.out.println(b1 != -1 ? (b1 != -2 ? "所查找元素在索引:" + a1 : "该数组为空"):"未找到所查找元素");
    }

    public static int getArrayDataIndexes(int[] arr, int data) {
        if (arr != null && arr.length > 0) {
            int i;
            for (i = 0; i < arr.length; i++) {
                if (arr[i] == data)
                    return i;
            }
            return -1;
        }
            return -2;
    }
}