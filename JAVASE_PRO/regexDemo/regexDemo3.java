package com.JAVASE_PRO.regexDemo;

import java.util.Scanner;

public class regexDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //checkPhoneNumber(sc);
        //checkEmail(sc);
        checkMoney(sc);
    }

    public static void checkMoney(Scanner sc){
        while (true) {
            System.out.println("请输入你的金额");
            String email = sc.next();
            if(email.matches("[0-9]{1,5}\\.?[0-9]{0,2}")){
                System.out.println("格式正确,输入成功");
                break;
            }else {
                System.out.println("格式错误，重新输入");
            }
        }
    }

    public static void checkEmail(Scanner sc) {
        while (true) {
            System.out.println("请输入你的邮箱");
            String email = sc.next();
            if(email.matches("\\w{1,30}@[A-Za-z0-9]{2,20}(\\.[A-Za-z0-9]{2,20}){1,2}")){
                System.out.println("格式正确,输入成功");
                break;
            }else {
                System.out.println("格式错误，重新输入");
            }
        }
    }


    public static void checkPhoneNumber(Scanner sc){
        while (true) {
            System.out.println("请输入你的手机号");
            String phoneNumber = sc.next();
            if(phoneNumber.matches("1[3-9]\\d{9}")){
                System.out.println("格式正确,输入成功");
                break;
            }else {
                System.out.println("格式错误，重新输入");
            }
        }
    }
}
