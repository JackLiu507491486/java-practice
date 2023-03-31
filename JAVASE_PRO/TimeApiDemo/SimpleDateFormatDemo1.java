package com.JAVASE_PRO.TimeApiDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        //格式化输出时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String rs = sdf.format(date);
        System.out.println(rs);

        //格式化输出毫秒值
        long time = System.currentTimeMillis();
        String st = sdf.format(time);
        System.out.println(st);

        //时间解析 有一个时间：2021-08-06 11:11:11 往后2天14小时49分6秒的时间
        //1.规定格式
        String dateStr = "2021-08-06 11:11:11";
        //2.
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf1.parse(dateStr);

        //3.
        long t = d.getTime() + (2L*24*60*60 + 14*60*60 + 49*60 + 6)*1000;
        System.out.println(sdf1.format(t));


    }
}
