package com.JAVASE_PRO.emunDemo;

public class print {
    public static void main(String[] args) {
        Season season = Season.WINTER;
        switch (season){
            case AUTUMN :
                System.out.println("秋");
                break;
            case SPRING:
                System.out.println("春");
                break;
            case SUMMER:
                System.out.println("夏");
                break;
            case WINTER:
                System.out.println("冬");
                break;
        }
    }
}
