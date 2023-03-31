package com.JAVASE_PRO.TimeApiDemo;

import java.util.Date;

/*
    学会使用日期类
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //获取时间毫秒值
        long time = date.getTime();
        System.out.println(time);
        //System.out.println(System.currentTimeMillis());



        //计算当前时间往后1h121s的时间
        System.out.println("--------------------------");
        long time1 = System.currentTimeMillis();
        time += (60 * 60 + 121) * 1000;
        Date d1 = new Date(time1);
        System.out.println("当前时间" + d1);
        Date d2 = new Date(time);
        System.out.println("加1h121s后时间" + d2);

    }
}
