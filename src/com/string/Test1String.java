package com.string;

public class Test1String {
    public static void main(String[] args) {
        String str  = "adbd";
        String str2 = new String("dfg");
        String str3 = "sdf"+"sdfge";
        String str4 = "18"+19;//不是加法，是字符串连接符
        System.out.println(str4);//1819

        //常量池
        String str5 = "abc";
        String str6 = "abc";
        String str7 = new String("abc");
        System.out.println(str5 == str6); //true
        System.out.println(str7 == str6); //false  str5和str7不是同一个对象

        //通常比较字符串时，使用equals
        System.out.println(str7.equals(str5)); //true


        String s1 = new String("abcdef");
        String s2 = s1.substring(2, 4);
        // 打印：ab199863
        System.out.println(Integer.toHexString(s1.hashCode()));
        // 打印：c61, 显然s1和s2不是同一个对象
        System.out.println(Integer.toHexString(s2.hashCode()));


        //编译器做了优化,直接在编译的时候将字符串进行拼接
        String st1 = "hello" + " java";//相当于st1 = "hello java";
        String st2 = "hello java";
        System.out.println(st1 == st2);//true
        String st3 = "hello";
        String st4 = " java";
        //编译的时候不知道变量中存储的是什么,所以没办法在编译的时候优化
        String st5 = st3 + st4;
        System.out.println(st2 == st5);//false
    }
}
