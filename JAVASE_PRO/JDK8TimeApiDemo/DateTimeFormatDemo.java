package com.JAVASE_PRO.JDK8TimeApiDemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String s1 = dtf.format(ldt);
        String s2 = ldt.format(dtf);
        System.out.println(s1);
        System.out.println(s2);

    }
}
