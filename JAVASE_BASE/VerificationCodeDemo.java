package com.JAVASE_BASE;
/**
 * 随机生成验证码
 */

import java.util.Random;

public class VerificationCodeDemo {
    public static void main(String[] args) {
        System.out.println(getVerificationCode(5));
    }
    public static String getVerificationCode(int digit){
        char[] ch = new char[digit];
        Random r = new Random();
        for(int i = 0;i < digit;i++){
            int j = r.nextInt(3);
            if(j == 0)//数字
                ch[i] = (char)( r.nextInt(10) + '0');
            else if (j == 1)//小写字母
                ch[i] = (char)( r.nextInt(26) + 'a');
            else//大写字母
                ch[i] = (char)( r.nextInt(26) + 'A');
        }
        return new String(ch);
    }
}
