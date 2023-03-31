/**
 * 利用for循环求1-10的奇数和
 */
package com.JAVASE_BASE;

public class ForCircleDemo2 {
    public static void main(String[] args) {
        int sum_data = 0;
        //方案一
        for(int i = 1;i <= 10;i+=2)
            sum_data += i;
        System.out.println("1-10的奇数和:" + sum_data);
        //方案二
        sum_data = 0;
        for(int i = 1;i <= 10;i++)
            if(i%2!=0)  sum_data += i;
        System.out.println("1-10的奇数和:" + sum_data);
    }
}
