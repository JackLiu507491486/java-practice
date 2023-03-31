package com.JAVASE_PRO.abstractDemo1;

public class test {
    public static void main(String[] args) {
        goldCard gc = new goldCard("张飞",10000);
        silverCard sc = new silverCard("刘备",5000);
        gc.pay(500);
        System.out.println(gc.getMoney());
        sc.pay(500);
        System.out.println(sc.getMoney());
    }
}
