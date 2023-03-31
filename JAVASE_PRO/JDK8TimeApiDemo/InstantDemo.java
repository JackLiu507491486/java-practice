package com.JAVASE_PRO.JDK8TimeApiDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class InstantDemo {
    public static void main(String[] args) {
        //创建一个时间戳对象
        Instant i = Instant.now();
        System.out.println(i);
        //转换时区
        ZonedDateTime zdt = i.atZone(ZoneId.systemDefault());
        System.out.println(zdt);
        //与Date互转
        Date d = Date.from(i);
        System.out.println(d);
    }

}
