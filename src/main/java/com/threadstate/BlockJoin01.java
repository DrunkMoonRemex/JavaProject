package com.threadstate;

/**
 * join合并线程，插队线程
 */
public class BlockJoin01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            for (int i= 0;i<100; i++){
                System.out.println("lambda..."+i);
            }
        });
        t.start();

        for (int i =0;i<100;i++){
            if (i==20){
                t.join();
            }
            System.out.println("main..."+i);
        }
    }

}
