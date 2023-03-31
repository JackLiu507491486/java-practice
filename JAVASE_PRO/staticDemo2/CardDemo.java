package com.JAVASE_PRO.staticDemo2;

import java.util.ArrayList;
/*
    代码块示例
    初始化静态资源
 */
public class CardDemo {
    public static ArrayList<String> cards = new ArrayList<>(54);

    static{
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♥","♦","♠","♣"};

        for (int i = 0;i < sizes.length;i++){
            for (int j = 0;j < colors.length;j++)
                cards.add(sizes[i] + colors[j]);
        }

        cards.add("小🃏");
        cards.add("大🃏");
    }

    public static void main(String[] args) {
        System.out.println("新牌:" + cards);
    }
}
