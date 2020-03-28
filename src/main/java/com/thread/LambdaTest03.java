package com.thread;

/**
 * 参数+返回值
 */
public class LambdaTest03 {

    public static void main(String[] args) {
        IInterest interest = (int a,int c)-> {
            System.out.println("I love lambda->"+a+","+c);
            return  a+c;
        };
        interest.lambda(100,200);

        interest = (a,c)-> {
            System.out.println("I love lambda->"+a+","+c);
            return  a+c;
        };
        interest.lambda(50,100);

        interest = (a,c)-> a+c;
        System.out.println(interest.lambda(10,20));

    }
}

interface IInterest{
    int lambda(int a,int b);
}

class Interest implements IInterest{
    @Override
    public int lambda(int a,int c) {
        System.out.println("I love lambda->"+a+","+c);
        return  a+c;
    }
}