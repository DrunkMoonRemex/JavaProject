package com.thread;

public class LambdaTest04 {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("一边学习lambda");
        }).start();

        new Thread(()->System.out.println("一边快乐中")).start();

    }
}
