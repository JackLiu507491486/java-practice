package com.JAVASE_PRO.regexDemo;

public class regexDemo2 {
    public static void main(String[] args) {
        //正则表达式
        //至少6位且必须是字母下划线或数字
        System.out.println("123456789qwe_".matches("\\w{6,}"));
        System.out.println("123".matches("\\w{6,}"));
        //验证码必须是数字和字符 必须4位
        System.out.println("as12".matches("[\\w&&[^_]]{4}"));
        System.out.println("qwe1".matches("[a-zA-Z0-9]{4}"));
    }
}
