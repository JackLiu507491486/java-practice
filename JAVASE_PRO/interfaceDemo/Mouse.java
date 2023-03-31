package com.JAVASE_PRO.interfaceDemo;

public class Mouse implements USB{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }
    public Mouse(){

    }

    public void click(){
        System.out.println(getName() + "点击鼠标");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void insert() {
        System.out.println(getName() + "USB连接");
    }

    @Override
    public void pullout() {
        System.out.println(getName() + "USB拔出");
    }
}
