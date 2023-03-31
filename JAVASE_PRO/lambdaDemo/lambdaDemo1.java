package com.JAVASE_PRO.lambdaDemo;

public class lambdaDemo1 {
    public static void main(String[] args) {
        //lambda简化匿名内部类 只能简化接口 单抽象方法的匿名内部类
        Animal a = () -> {
            System.out.println("老虎跑得快");
        };
        go(a);
        System.out.println("-----------------------");
        go(() -> {
            System.out.println("乌龟跑的慢");
        });
    }

    public static void go(Animal animal){
        System.out.println("开始");
        animal.run();
        System.out.println("结束");
    }
}

@FunctionalInterface //加上这个是函数式接口
interface Animal{
     public abstract void run();
}
