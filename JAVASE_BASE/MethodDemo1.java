package com.JAVASE_BASE;

import java.util.Scanner;

/**
 * 利用方法调用实现从1-n的相加
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        System.out.print("请输入n的值：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int add = sum(n);
        System.out.println("从1-" + n + "的和：" + add);
    }

    public static int sum(int n){
        int add = 0;
        for(int i = 1;i <= n;i++){
            add += i;
        }
        return add;
    }
}
