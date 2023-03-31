package com.JAVASE_BASE;
/**
 * 将手机号中间4位替换成****
 * 例如 18635271099 -> 186****1099
 */

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNumber;
        //String changeNumber;
        String afterNumber;
        while(true) {
            System.out.print("请输入手机号:");
            phoneNumber = sc.next();

            if(phoneNumber.length() != 11)
                System.out.println("你的手机号输入有误请重新输入!" + "\n");
            else{
               afterNumber = phoneNumber.substring(0,3) + "****" + phoneNumber.substring(7);
               break;
            }
        }
        System.out.println("电话号:" + afterNumber);
    }
}
