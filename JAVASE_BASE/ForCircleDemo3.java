/**
 * 利用for循环输出所有的水仙花数
 * 水仙花数 ： 三位整数，且 每一位的立方和等于原数
 */
package com.JAVASE_BASE;

public class ForCircleDemo3 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("水仙花数：");
        for(int i = 100;i <= 999;i++){
                int ge = i%10,
                    shi = i/10%10,
                    bai = i/100;
                int temp = ge*ge*ge+shi*shi*shi+bai*bai*bai;
                if(temp == i) {System.out.println(temp); count++;}
        }
        System.out.println("水仙花数的个数：" + count);
    }
}
