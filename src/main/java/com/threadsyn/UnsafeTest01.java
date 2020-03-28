package com.threadsyn;

/**
 * 线程不安全，数据有负数和相同的情况
 */
public class UnsafeTest01 {
    public static void main(String[] args) {
        //一份资源
        Web12306 web = new Web12306();
        System.out.println(Thread.currentThread().getName());
        //多个代理
        new Thread(web,"小红").start();
        new Thread(web,"小黄").start();
        new Thread(web,"小蓝").start();
    }
}
class Web12306 implements Runnable{

    //票数
    private int ticketNums = 99;
    @Override
    public void run() {
        while (true){
            if (ticketNums<0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
        }
    }
}