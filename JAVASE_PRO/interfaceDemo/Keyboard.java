package com.JAVASE_PRO.interfaceDemo;

public class Keyboard implements USB{
    private String mane;

    public Keyboard(String mane) {
        this.mane = mane;
    }

    public Keyboard(){

    }

    public String getMane() {
        return mane;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }

    public void downKey(){
        System.out.println(mane + "敲击键盘");
    }

    @Override
    public void insert() {

    }

    @Override
    public void pullout() {

    }
}
