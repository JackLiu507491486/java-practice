package com.JAVASE_BASE;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        String okUser = "admin";
        String okPassword = "123456789";

        Scanner sc = new Scanner(System.in);
        String scUser;
        String scPassword;

        for (int i = 0;i < 3;i++){
            System.out.print("用户名:");
            scUser = sc.next();
            System.out.print("密码:");
            scPassword = sc.next();

            if(!scUser.equals(okUser)) System.out.println("用户名不存在");
            else if(!scPassword.equals(okPassword)) System.out.println("密码输入有误");
            else System.out.println("登陆成功！！");
        }
    }
}
