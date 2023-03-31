/**
 * 珠穆朗玛峰高8848.86米（8848860毫米）
 * 一张纸的厚度为0.1毫米，请问一张纸折叠几次就会超过珠穆朗玛峰
 */
package com.JAVASE_BASE;

public class WhileCircleDemo {
    public static void main(String[] args) {
        //方案一：正向解决
        float height = 8848860f;
        float temp1 = 0.1f;
        int count1 = 0;
        while(temp1 < height){
            temp1 *= 2;
            count1++;
        }
        System.out.println("折叠" + count1 + "次会超过珠穆朗玛峰");

        //方案二 反向解决
        float thickness = 0.1f;
        float temp2 = 8848860f;
        int count2 = 0;
        while(temp2 > thickness){
            temp2 /= 2;
            count2++;
        }
        System.out.println("折叠" + count2 + "次会超过珠穆朗玛峰");
    }
}
