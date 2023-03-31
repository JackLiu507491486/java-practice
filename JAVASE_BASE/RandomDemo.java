/**
 * Random生成区间利用减加法
 * 例如生成1-10的随机数 Random r = new Random()
 *                   int a = r.nextInt(10)+1
 *    生成3-17的随机数:int b = r.nextInt(15)+3
 */

/**
 * 随机生成一个1-100的随机数
 * 用户输入猜数
 */

package com.JAVASE_BASE;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int guess_num = 0;
        while(true){
            System.out.print("请输入你要猜的数：");
            guess_num = sc.nextInt();
            if(guess_num >100 || guess_num < 0)
                System.out.println("你的输入有误");
            else if(guess_num > num)
                System.out.println("你猜的数偏大");
            else if(guess_num < num)
                System.out.println("你猜的数偏小");
            else {
                System.out.println("你猜对了！随机数是" + num);
                break;
            }
        }
    }
}
