package com.thread;

/*
多线程实现方式一
1、创建：继承Thread类+重写run方法
2、启动：创建子类对象+调用start()方法
 */
public class StartThread extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        StartThread st = new StartThread();
        st.start();//启动线程
        //st.run();这里是直接调用方法，没有启动线程，是顺序执行
        for (int i = 0;i<100;i++){
            System.out.println("一边敲代码");
        }
    }

}
