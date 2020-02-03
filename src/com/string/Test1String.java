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
    }
}
