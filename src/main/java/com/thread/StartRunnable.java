package com.thread;

/*
多线程实现方式二
1、创建：实现Runnable接口+重写run方法
2、启动：创建实现类对象+Thread对象+调用start()方法

推荐使用的方式，避免单继承的局限性，优先使用接口
 */
public class StartRunnable implements  Runnable{
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        StartRunnable st = new StartRunnable();
        Thread thread = new Thread(st);
        thread.start();//启动线程
        //st.run();这里是直接调用方法，没有启动线程，是顺序执行
        for (int i = 0;i<100;i++){
            System.out.println("一边敲代码");
        }
    }

}
