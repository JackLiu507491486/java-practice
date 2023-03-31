package com.JAVASE_PRO.JDK8TimeApiDemo;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        //获取当前时间
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        //获取时分秒
        System.out.println("时：" + lt.getHour());
        System.out.println("分：" + lt.getMinute());
        System.out.println("秒：" + lt.getSecond());
        System.out.println("纳秒：" + lt.getNano());

        //设置指定时间
        LocalTime lt1 = LocalTime.of(15,20,59);
        System.out.println(lt1);


    }
}
