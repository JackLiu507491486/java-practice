/**
 把一个三位整数的个位、十位、百位显示出来（ps：利用算术运算符）
 */



package com.JAVASE_BASE;

public class OperationalCharacterDemo {
    public static void main(String[] args) {

        int data = 589;
        //个位
        int a = data % 10;
        //十位
        int b = ((data - a)/10)%10;
        //更优解 int b = (data/10)%10
        //百位
        int c = data/100;
        System.out.println("个位是:" + a);
        System.out.println("十位是:" + b);
        System.out.println("百位是:" + c);
        
    }
}
