package com.JAVASE_BASE.ATMDemo;

/**
 * 账户类
 */
public class Account {
    private String ID;
    private String name;
    private String password;
    private double money;
    final double maxMoney = 5000;

    public Account(String ID, String name, String password, double money) {
        this.ID = ID;
        this.name = name;
        this.password = password;
        this.money = money;
    }

   public Account(){

   }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }


}
