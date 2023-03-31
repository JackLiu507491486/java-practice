package com.JAVASE_BASE;

import java.util.Scanner;

public class PassWordDemo {
    public static void main(String[] args) {
        System.out.println("输入加密的数字个数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            System.out.print("请输入第" + (i+1) + "个数:");
            arr[i] = sc.nextInt();
        }

        int []password = new int[n];
        for (int i = 0;i < n;i++){
            password[i] = (arr[n-i-1]+5)%10;
        }
        System.out.println("加密后密码:");
        for (int i = 0;i < n;i++){
            System.out.print(password[i]);
        }
    }
}
