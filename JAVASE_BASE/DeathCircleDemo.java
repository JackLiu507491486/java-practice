/**
 * 系统密码是520，
 * 请用户不断输入密码验证，
 * 验证不对输出密码措姆，成功则输出欢迎进入系统，并停止程序
 */
package com.JAVASE_BASE;

import java.util.Scanner;

public class DeathCircleDemo {
    public static void main(String[] args) {
        System.out.print("请输入密码：");
        Scanner sc = new Scanner(System.in);
        int password = 0;
        while(true){
            password = sc.nextInt();
            if(password == 520) {
                System.out.println("欢迎进入程序！");
                break;
            }
            System.out.print("密码错误，请再次输入密码：");
        }
    }
}
