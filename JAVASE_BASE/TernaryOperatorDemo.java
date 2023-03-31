/**
 * 利用三元运算符求得三个数的最大值
 */
package com.JAVASE_BASE;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        //比较常规
        int a = 10,b = 20,c = -150;
        int temp = a > b ? a:b;
        int max1 = temp > c ? temp:c;
        System.out.println("最大值：" + max1);
        //比较简单
        int max2 = (a > b ? a:b)>c ?(a > b ? a:b):c;
        System.out.println("最大值：" + max2);
        //嵌套
        int max3 = a > b ? (a > c ? a:c) :(b > c ? b:c);
        System.out.println("最大值：" + max3);
    }
}
