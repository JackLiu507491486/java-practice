package com.JAVASE_PRO.abstractDemo1;

public abstract class Card {
    private String name;
    private double money;

    public Card(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public Card(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    public abstract void pay(double payMoney);


}
