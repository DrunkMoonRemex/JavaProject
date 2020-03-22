package com.thread;

/**
 * 静态代理
 * 公共接口
 * 1、真实角色
 * 2、代理角色
 */
public class StaticProxy {
    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMarry();

        //new Thread(线程对象).start();
    }
}

interface  Marry{
    void happyMarry();
}

//真实角色
class You implements  Marry{

    @Override
    public void happyMarry() {
        System.out.println("you harry to marry");
    }
}
class WeddingCompany implements  Marry{

    private You you;

    public WeddingCompany(You you) {
        this.you = you;
    }

    @Override
    public void happyMarry() {
        ready();
        this.you.happyMarry();
        over();
    }

    private void over() {
        System.out.println("marry over...");
    }

    private void ready() {
        System.out.println("marry ready ...");
    }
}
