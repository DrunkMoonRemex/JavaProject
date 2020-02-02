package com.company;

public class Test4Math {
    public static void main(String[] args) {
        System.out.println(Math.ceil(11.3));//向上取整，结果是double
        System.out.println(Math.ceil(11.99));//向上取整，结果是double

        System.out.println(Math.floor(11.3));//向下取整
        System.out.println(Math.floor(11.99));

        System.out.println(Math.max(20,30));//获取2个数中的最大值
        System.out.println(Math.max(20.3,30.9));//获取2个数中的最大值

        System.out.println(Math.pow(2,3));//2.0^3.0=8.0

        System.out.println(Math.sqrt(9));//9的平方根

        System.out.println(Math.random());//[0.0-1.0)之间的小数

        System.out.println(Math.round(4.4f));//四舍五入,返回值是int类型
        System.out.println(Math.round(4.6f));
        System.out.println(Math.round(4.6));

    }
}
