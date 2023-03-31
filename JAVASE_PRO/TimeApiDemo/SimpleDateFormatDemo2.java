package com.JAVASE_PRO.TimeApiDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    1元秒杀活动时间 2020年11月11日 0:0:0 - 2020年11月11日 0:10:0
    有两人下单时间 2020年11月11日 0:3:47 和 2020年11月11日0:10:11
 */
public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        String startTime = "2020年11月11日 0:0:0";
        String endTime = "2020年11月11日 0:10:0";

        String people1 = "2020年11月11日 0:3:47";
        String people2 = "2020年11月11日 0:10:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        Date date1 = sdf.parse(startTime);
        Date date2 = sdf.parse(endTime);

        Date date3 = sdf.parse(people1);
        Date date4 = sdf.parse(people2);

        if(date3.after(date1) && date3.before(date2)){
            System.out.println("1秒杀成功");
        }else {
            System.out.println("1秒杀失败");
        }

        if(date4.after(date1) && date4.before(date2)){
            System.out.println("2秒杀成功");
        }else {
            System.out.println("2秒杀失败");
        }
        /*long t1 = date1.getTime();
        long t2 = date2.getTime();

        if(date4.getTime() >= t1 && date4.getTime() <= t2)
            System.out.println("秒杀成功");
        else System.out.println("秒杀失败");*/



    }
}
