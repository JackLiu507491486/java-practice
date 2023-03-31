package com.JAVASE_PRO.JDK8TimeApiDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();

        System.out.println(ld);
        System.out.println(lt);

        LocalDateTime ldt1 = LocalDateTime.of(2020,1,1,20,00,00);
        System.out.println(ldt1);
    }
}
