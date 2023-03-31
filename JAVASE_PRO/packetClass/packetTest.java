package com.JAVASE_PRO.packetClass;

public class packetTest {
    public static void main(String[] args) {

        //装箱
        int a1 = 100;
        Integer i = a1;
        System.out.println(a1);
        System.out.println(i);

        //拆箱
        Integer i1 = 50;
        System.out.println(i1);
        int a = i1;
        System.out.println(a);

        Double d = 3.14;
        System.out.println(d.toString());

        //数据转字符串
        String st = Integer.toString(23);
        String st1 = 23 + "";

        System.out.println("------------------");
        //字符串转相应数据
        int in = Integer.parseInt("205");
        System.out.println(in + 20);
        int in1 = Integer.valueOf("205");
        System.out.println(in1 + 5);
        //Double d1 = Double.parseDouble("60.5");
        //System.out.println(d1 + 10.5);

    }
}
