package com.JAVASE_BASE;

import java.util.Random;
import java.util.Scanner;

/**
 * 投注号码由6个红球号码和一个蓝球号码组成
 * 红球号码从1-33中随机选择
 * 蓝球号码从1-16中随机选择
 */
public class DoubleColorBallSystemDemo {
    public static void main(String[] args) {
        int[] lucky_number = createNumber();
        int[] user_number = userInputNumber();
        System.out.print("双色球中奖号码:");
        printArray(lucky_number);
        System.out.print("用户购买彩票号码:");
        printArray(user_number);

        compareArray(lucky_number,user_number);
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0;i < array.length;i++)
            System.out.print(array[i] + ",");
        System.out.println("]");
    }


    public static int[] createNumber(){
        int[] winning_number = new int[7];
        Random r = new Random();
        int n = 0;
        while(true){
            boolean flag = true;
            int temp = r.nextInt(33) + 1;
            for(int j = 0;j <= n;j++){
                if(winning_number[j] == temp) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                winning_number[n] = temp;
                n++;
            }
            if(n == 6)  break;
        }
        winning_number[6] = r.nextInt(16) + 1;
        return winning_number;
    }

    public static int[] userInputNumber(){
        Scanner sc = new Scanner(System.in);
        int[] user_number = new int[7];
        for (int i = 0;i < user_number.length;i++){
            System.out.print(i < 6 ? "请输入第" + (i+1) + "个红球号码":"请输入蓝球号码:");
            user_number[i] = sc.nextInt();
        }
        return user_number;
    }
    public static void compareArray(int[] arr1,int[] arr2){
        int temp = 0;
        //判断红球
        for(int i = 0;i < arr1.length-1;i++){
            for(int j = 0;j < arr2.length-1;j++){
                if(arr1[j] == arr2[i]) {
                    temp++;
                    break;
                }
            }
        }
        if(arr1[arr1.length - 1] == arr2[arr2.length - 1]){
            System.out.print("恭喜你，你中了" + temp + "个红球" + "1个蓝球,");
            switch (temp){
                case 0: case 1:{
                    System.out.println("六等奖，价值5元");break;
                } case 2: case 3:{
                    System.out.println("五等奖，价值10元");break;
                } case 4:{
                    System.out.println("四等奖，价值200元");break;
                } case 5:{
                    System.out.println("三等奖，价值3000元");break;
                } case 6:{
                    System.out.println("一等奖，价值1000万元！！！");break;
                }
            }
        }else if(temp >= 4){
            System.out.print("恭喜你，你中了" + temp + "个红球");
            switch (temp){
                case 4:{
                    System.out.println("五等奖，价值10元");break;
                } case 5:{
                    System.out.println("四等奖，价值200元");break;
                } case 6:{
                    System.out.println("二等奖，价值500万元");break;
                }
            }
        }else{
            System.out.println("很遗憾，你没有中奖");
        }
    }
}
