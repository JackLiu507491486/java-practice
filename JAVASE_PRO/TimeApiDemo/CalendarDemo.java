package com.JAVASE_PRO.TimeApiDemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        //拿到此刻日历对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        //从该对象里面的提取信息
        int year = calendar.get(Calendar.YEAR);
        int moon = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + moon + "月" + day + "日");

        //修改某个字段的信息
       /* calendar.set(Calendar.YEAR,1999);
        int year1 = calendar.get(Calendar.YEAR);
        System.out.println(year1 + "年");*/

        //为时间加上某个值 例如 加64天后是几号
        calendar.add(Calendar.DAY_OF_YEAR,64);
        int year1 = calendar.get(Calendar.YEAR);
        int moon1 =  calendar.get(Calendar.MONTH) + 1;
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year1 + "年" + moon1 + "月" + day1 + "日");

        //拿到此刻日期对象
        Date date = calendar.getTime();
        System.out.println(date);

        //拿时间毫秒值
        long l = calendar.getTimeInMillis();

    }
}
