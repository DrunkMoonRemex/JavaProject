package com.threadstate;

public class AllState {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for (int i = 0 ;i<5;i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("......");
        });
        //观察状态
        Thread.State state = t.getState();
        System.out.println(state);//NEW

        t.start();
         state = t.getState();
        System.out.println(state);//RUNNABLE

        /*while (state != Thread.State.TERMINATED){//TERMINATED
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = t.getState();
            System.out.println(state);//TIMED_WAITING
        }*/
        while (true){//TERMINATED
            //活动的线程数
            int activeCount = Thread.activeCount();
            System.out.println(activeCount);
            //eclipse为1个，idea为2个
            if (activeCount==2){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = t.getState();
            System.out.println(state);//TIMED_WAITING
        }

    }
}
