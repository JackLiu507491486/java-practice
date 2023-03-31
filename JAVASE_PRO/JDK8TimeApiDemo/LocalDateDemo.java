package com.JAVASE_PRO.JDK8TimeApiDemo;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

    public static void main(String[] args) {
        //获取当前日期
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        //获取年月日
        System.out.println("Year:" + ld.getYear());
        System.out.println("Month:" + ld.getMonth());
        System.out.println("Month:" + ld.getMonth().getValue());
        System.out.println("Day:" + ld.getDayOfMonth());

        //获取周几
        System.out.println("Week:" + ld.getDayOfWeek());
        System.out.println("Week:" + ld.getDayOfWeek().getValue());

        System.out.println(ld.minusDays(30));

        //设置指定时间
        LocalDate ld1 = LocalDate.of(2001,8,14);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2001, Month.AUGUST,14);
        System.out.println(ld2);

    }

}
