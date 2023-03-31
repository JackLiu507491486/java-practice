package com.JAVASE_BASE.ShoppingDemo;

public class Goods {
    private int id;
    private String name;
    private double price;
    private int buyNumber;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
