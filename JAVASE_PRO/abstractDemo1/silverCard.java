package com.JAVASE_PRO.abstractDemo1;

public class silverCard extends Card{
    public silverCard(String name, int money) {
        super(name,money);
    }

    public silverCard(){
    }
    @Override
    public void pay(double payMoney) {
        System.out.println("您支付原价为：" + payMoney);
        double money = payMoney * 0.85;
        System.out.println("优惠后价格为:" + money);
        System.out.println("账户当前余额为：" + getMoney());
        if(getMoney() < money){
            System.out.println("账户余额不足");
        }else {
            setMoney(getMoney() - money);
            System.out.println("账户支付后余额为：" + getMoney());
        }
    }
}
