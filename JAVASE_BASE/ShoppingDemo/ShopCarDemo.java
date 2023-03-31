package com.JAVASE_BASE.ShoppingDemo;

import java.util.Scanner;

public class ShopCarDemo {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];
        while(true){
            selectOperation(UI(),shopCar);
        }


    }

    public static int lengthNumber(Goods[] shopCars){
        int num = 0;
        while(shopCars[num] != null && num < shopCars.length)
            num++;
        return num;
    }

    public static void add(Goods[] shopCars){
        Scanner sc = new Scanner(System.in);
        shopCars[lengthNumber(shopCars)] = new Goods();
        Goods goods = shopCars[lengthNumber(shopCars) - 1];
        goods.setId(lengthNumber(shopCars));
        System.out.println("请输入以下商品信息");
        System.out.print("名称:");
        goods.setName(sc.next());
        System.out.print("价格:");
        goods.setPrice(sc.nextDouble());
        System.out.print("购买数量:");
        goods.setBuyNumber(sc.nextInt());
        System.out.println("-----------------------------------------");
    }

    public static void query(Goods[] shopCars){
        System.out.println("您的购物车商品如下:");
        for (int i = 0;i < lengthNumber(shopCars);i++)
            if(shopCars[i]!=null)
            System.out.println("编号:" + shopCars[i].getId() + "\n" +
                               "名称:" + shopCars[i].getName() + "\n" +
                               "价格:" + shopCars[i].getPrice() + "\n" +
                               "数量:" + shopCars[i].getBuyNumber() + "\n ");
        System.out.println("-----------------------------------------");
    }

    public static void update(Goods[] goods){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要修改商品的id:");
        int id = sc.nextInt();
        if(id <= lengthNumber(goods) && goods[id -1] !=null){
            System.out.print("重新输入购买的数量:");
            goods[id-1].setBuyNumber(sc.nextInt());
        }else System.out.println("该商品不存在!");
        System.out.println("-----------------------------------------");
    }

    public static void pay(Goods[] goods){
        System.out.print("你购买的商品总价格为:");
        double sumPrice = 0.0;
        for (int i = 0;i < lengthNumber(goods); i++)
            sumPrice += goods[i].getPrice()*goods[i].getBuyNumber();
        System.out.println(sumPrice);
    }

    public static String UI(){
        Scanner sc = new Scanner(System.in);
        String operation = null;
        //UI
        System.out.println("添加商品:add");
        System.out.println("查看商品:query");
        System.out.println("修改数量:update");
        System.out.println("结算价格:pay");
        System.out.print("请输入你要进行的操作");
        operation = sc.next();
        return operation;
    }

    public static void selectOperation(String operation,Goods[] shopCars){
        switch (operation){
            case "add": add(shopCars);break;
            case "query": query(shopCars);break;
            case "update": update(shopCars);break;
            case "pay": pay(shopCars);break;
            default:
                System.out.println("没有该功能。");
        }
    }
}

