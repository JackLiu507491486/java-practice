package com.JAVASE_PRO.extentsDemo1;

public class People {
    private String name;
    private int age;

    public void seeCourse(){
        System.out.println(name + "查看课表");
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
