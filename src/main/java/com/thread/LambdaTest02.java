package com.thread;

/**
 * 加入参数
 */
public class LambdaTest02 {

    public static void main(String[] args) {
        ILove love =  (int a) ->{
            System.out.println("I love lambda->"+a);
        };
        love.lambda(100);


        //简化
        love = (a)->{
            System.out.println("I love lambda->"+a);
        };
        love.lambda(50);

        love = a->{
            System.out.println("I love lambda->"+a);
        };
        love.lambda(5);

        love = a-> System.out.println("I love lambda->"+a);
        love.lambda(0);


    }
}

interface ILove{
    void lambda(int a);
}

class Love implements ILove{
    @Override
    public void lambda(int a) {
        System.out.println("I love lambda->"+a);
    }
}