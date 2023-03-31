package com.JAVASE_PRO.interfaceDemo;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer("外星人");
        c.start();

        USB m = new Mouse("夏普");
        c.installUSB(m);

        USB k = new Keyboard("小米");
        c.installUSB(k);

    }
}
