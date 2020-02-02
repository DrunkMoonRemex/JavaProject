package com.company;


public class Test6System {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        int[] arr = {12,34,56,78};
        int[] b = new int[5];
        System.arraycopy(arr,1,b,1,2);//将数组arr下标1的位置，复制到数组b从下标1开始的位置，共复制2个
        /*
            src --> 源数组
　　　　　　srcPos --> 源数组中的起始位置。
　　　　　　dest --> 目标数组。
　　　　　　destPos --> 目标数据中的起始位置。
　　　　　　length --> 要复制的数组元素的数量。
         */
        for (int value : b) {
            System.out.println(value);
        }

        System.out.println(System.currentTimeMillis());
    }
}
