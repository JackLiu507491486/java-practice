package com.JAVASE_BASE;

import java.util.Scanner;

/**
 * 完成买飞机票的流程
 */
public class BuyAPlaneTicketDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        double price = sc.nextDouble();
        System.out.println("请输入乘坐飞机的月份:");
        int moon = sc.nextInt();
        System.out.println("请输入是头等舱还是经济舱:");
        String st = sc.next();

        double real_price = imputedPrice(price,moon,st);
        if(real_price != 0) {
            System.out.println("折扣后机票价格：" + real_price);
        }else{
            System.out.println("你的输入有误");
        }
    }

    public static double imputedPrice(double price,int moon,String st){
        double real_price = 0;
        if(moon >= 5 && moon <= 10){
            //旺季
            switch (st) {
                case "头等舱":{
                    real_price = price * 0.85;
                    break;
                }
                case "经济舱":{
                    real_price = price * 0.9;
                    break;
                }default:{
                    System.out.println("你的舱位输入有误");
                }
            }
        }else if ((moon >=1 && moon <= 4) || moon == 11 || moon == 12){
            //淡季
            switch (st){
                case "头等舱":{
                    real_price = price * 0.7;
                    break;
                }
                case  "经济舱":{
                    real_price = price * 0.65;
                    break;
                } default:{
                    System.out.println("你的舱位输入有误");
                }
            }
        }else{
            System.out.println("输入月份有误");
        }
        return real_price;
    }
}
