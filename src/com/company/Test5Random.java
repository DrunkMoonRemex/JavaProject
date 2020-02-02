package com.company;

import java.util.Random;

public class Test5Random {
    public static void main(String[] args) {
        Random random = new Random();//没有给种子，用的是默认种子，是当前时间的毫秒值，随机数不相同
        System.out.println(random.nextInt());//返回的是int范围内的随机数
        System.out.println(random.nextInt(100));//生成[0,100)之间的随机数

        Random random1 = new Random(100);//给出指定的种子，每次种子相同，随机数就相同
        System.out.println(random1.nextInt(10));//每次运行都是一样的值
        System.out.println(random1.nextInt(10));//每次运行都是一样的值
        System.out.println(random1.nextInt(10));//每次运行都是一样的值
        System.out.println(random1.nextInt(10));//每次运行都是一样的值
        System.out.println(random1.nextInt(10));//每次运行都是一样的值
    }
}
