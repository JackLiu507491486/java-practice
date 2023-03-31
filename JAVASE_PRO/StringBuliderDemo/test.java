package com.JAVASE_PRO.StringBuliderDemo;

public class test {
    public static void main(String[] args) {
        int []a = {100,101,15,48,96,16,55,20};
        System.out.println(printAry(a));
        int []a1 = null;
        System.out.println(printAry(a1));
        int []a2 = {};
        System.out.println(printAry(a2));
    }

    public static String printAry(int []ary){
        if (ary != null) {
            StringBuilder s = new StringBuilder();
            s.append("该数组的内容为:[");
            for (int i = 0; i < ary.length; i++) {
                s.append(ary[i]).append(i == ary.length - 1 ? "" : ",");


            /*if(i != ary.length-1){
                s.append(ary[i] + ",");
            }else {
                s.append(ary[i]);
            }*/
            }
            s.append("]");
            return s.toString();
        }else{
            return null;
        }

    }
}
