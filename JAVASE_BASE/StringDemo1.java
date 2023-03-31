package com.JAVASE_BASE;

import java.util.Random;

/**
 * 生成一个5位随机验证码
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String st = "";
        for (char i = '0';i <= '9';i++)
            st += i;
        for (char i = 'a';i <= 'z';i++)
            st += i;
        for (char i = 'A';i <= 'Z';i++)
            st += i;
        char[] chars = new char[5];
        Random r = new Random();
        for (int j = 0;j < 5;j++){
        for (int i = 0;i < chars.length;i++){
            int temp = r.nextInt(st.length());
            chars[i] = st.charAt(temp);
        }
        System.out.println( new String(chars));}
    }
}
