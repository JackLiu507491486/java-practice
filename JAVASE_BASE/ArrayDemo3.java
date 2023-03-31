package com.JAVASE_BASE;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 * 随机生成1-20之间的5个数（无所谓是否重复）
 * 未猜中提示未猜中
 * 猜中了提示猜中了并输出 这个数字第一次出现的位置且输出5个数据 结束程序
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        Random r = new Random();
        int []r_num = new int[5];
        for(int i = 0;i < r_num.length;i++)
            r_num[i] = r.nextInt(20)+1;
        int g_num,first_position;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("请输入你要猜的数字：");
            g_num = sc.nextInt();
            for(first_position = 0;first_position < r_num.length;first_position++){
                if(g_num == r_num[first_position])  break;
            }
            if(first_position != r_num.length) {
                System.out.println("运气不错，命中了,出现在数组的第" + (first_position + 1) + "位");
                break;
            }else System.out.println("未命中");
        }
        System.out.print("数组内容：");
        for(int i = 0;i < r_num.length;i++){
            System.out.print(r_num[i] + " ");
        }
    }
}
