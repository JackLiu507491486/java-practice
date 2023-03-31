package com.JAVASE_PRO.regexDemo;

import javax.print.DocFlavor;

public class regexDemo1 {
    //验证qq号码合理 6-20位数字
    public static void main(String[] args) {
        System.out.println(checkQQ("105205"));
        System.out.println(checkQQ("12"));
        System.out.println(checkQQ("184616546a156"));

        System.out.println(checkQQ1("105205"));
        System.out.println(checkQQ1("12"));
        System.out.println(checkQQ1("184616546a156"));
    }

    //利用正则表达式
    public static boolean checkQQ1 (String qq){
        return qq != null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq){
        //过滤不成立情况
        if(qq == null || qq.length() > 20 || qq.length() < 6)
            return false;
        for (int i = 0;i < qq.length();i++){
            char ch = qq.charAt(i);
            if(ch < '0' || ch > '9')
                return false;
        }
        return true;
    }

}
