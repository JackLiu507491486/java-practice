package com.JAVASE_BASE;

import java.util.Scanner;

/**
 * 利用方法调用实现判断一个值是奇是偶
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        JudgeParity(n);
    }

    public static void JudgeParity(int n){
        if(n%2 == 0) System.out.println(n + "是偶数");
        else System.out.println(n + "是奇数");
    }
}
