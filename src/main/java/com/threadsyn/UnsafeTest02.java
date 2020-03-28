package com.threadsyn;

public class UnsafeTest02 {
    public static void main(String[] args) {
        Account account = new Account(100,"结婚礼金");
        Drawing you = new Drawing(account,80,"zhangsan");
        Drawing wife = new Drawing(account,70,"xiaohhuang");
        you.start();
        wife.start();

    }
}
class Account{
    int money;//金额
    String name;//名称

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }

}
//模拟取款
class Drawing extends Thread{

    Account account;//取钱的账户
    int drawingMoney;//取的钱数
    int pocketTatal;//口袋的钱总数

    public  Drawing(Account account,int drawingMoney,String name){
        super(name);
        this.account = account;
        this.drawingMoney=drawingMoney;

    }

    @Override
    public void run() {
        if (account.money-drawingMoney<0){
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.money -= drawingMoney;
        pocketTatal +=drawingMoney;
        System.out.println(this.getName()+"-->账户余额为："+account.money);
        System.out.println(this.getName()+"-->口袋的钱为："+pocketTatal);

    }
}