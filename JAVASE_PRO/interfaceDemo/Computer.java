package com.JAVASE_PRO.interfaceDemo;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public Computer(){

    }

    public void start(){
        System.out.println(name + "开机~~~~");
    }

    public void installUSB(USB usb){
        //多态 ： usb 可能为键盘 或者 鼠标
        usb.insert();

        //独有功能:先判断再强转
        if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.downKey();
        }else if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }

        usb.pullout();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
