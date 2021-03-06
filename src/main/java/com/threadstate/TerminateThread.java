package com.threadstate;

/**
 * 终止线程
 * 1、线程正常执行完毕 --》次数
 * 2、外部干涉--》加入标识
 * 不要使用stop destroy
 */
public class TerminateThread implements Runnable {
    //1、加入标识 标记线程体是否可以运行
    private boolean flag = true;
    private String name;

    public TerminateThread(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        TerminateThread td = new TerminateThread("zhangsan");
        new Thread(td).start();

        for (int i = 0;i<=99;i++){
            if (i==88){
                //线程终止
                td.terminate();
                System.out.println("td game over!!");
            }
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }

    @Override
    public void run() {
        int i = 0;
        //2、关联标识，true-->运行 false -->停止
        while (flag) {
            System.out.println(name + "-->" + i++);
        }
    }

    //3、对外提供方法改变标识
    public void terminate(){
        this.flag=false;
    }
}
