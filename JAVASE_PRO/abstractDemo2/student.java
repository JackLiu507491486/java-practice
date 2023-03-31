package com.JAVASE_PRO.abstractDemo2;

public abstract class student {
    public final void write(){
        System.out.println("\t标题");
        System.out.println(writeMain());
        System.out.println("结尾");
    }
   public abstract String writeMain();
}
