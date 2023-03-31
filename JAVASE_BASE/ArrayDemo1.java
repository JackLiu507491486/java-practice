package com.JAVASE_BASE;

/**
 * 数组的元素求和
 * 案例需求：16、26、36、6、100求和
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        int sales[] = {16,26,36,6,100};
        int sum = 0;
        for (int i = 0;i < sales.length;i++){
            sum += sales[i];
        }
        System.out.println("销售额为："+sum);
    }
}
