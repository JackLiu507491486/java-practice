package com.JAVASE_BASE;

import java.util.Scanner;

/**
 * 6个评委打分去掉最高分、最低分的平均分
 */
public class RatingSystemDemo {
    public static void main(String[] args) {
        int[] score = new int[6];
        Scanner sc = new Scanner(System.in);
        //输入分数进入数组
        for(int i = 0;i < score.length;i++){
            System.out.println("请输入第"  + (i+1) + "位评委的分数");
            score[i] = sc.nextInt();
        }
        int max = score[0],min = score[0],sum = score[0];
        for(int i = 1;i < score.length;i++){
            //求和
            sum += score[i];
            if(max < score[i])  max = score[i];
            if(min > score[i])  min = score[i];
        }
        double ave = (sum-max-min) * 1.0/(score.length-2);
        System.out.println("去掉一个最高分" + max + ",去掉一个最低分" + min + ",最后的平均分为:" + ave);
    }

}
