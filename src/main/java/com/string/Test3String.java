package com.string;

import java.util.Arrays;

public class Test3String {
    public static void main(String[] args) {
        String str = "abcdefg";

        //length():统计当前字符串的字符个数
        int i = str.length();
        System.out.println(i);

        //indexOf()：查找指定字符再字符串中的位置
        int index = str.indexOf("a");
        System.out.println(index);

        //小写转大写
        //toUpperCase():将字符串中的字符变为了大写形式
        String str1 = str.toUpperCase();
        System.out.println(str1);

        //toLowerCase():将字符串中的字符变为小写
        String str2 = "WWMMDDHH";
        String str3 = str2.toLowerCase();
        System.out.println(str3);

        //substring:截取字符串
        String str4 = "abcdefgh";
        String str5 = str4.substring(0, 3);
        System.out.println(str5);//abc
        String str6 = str4.substring(3);
        System.out.println(str6);//defgh

        //replaceAll:替换当前字符串中指定内容
        String str7 = str4.replaceAll("abc", "xyz");
        System.out.println(str7);

        //trim:能够去掉当前字符串中两端的空格
        String str8 = " abc def ";
        System.out.println(str8.length());//9
        String str9 = str8.trim();
        System.out.println(str8);// abc def
        System.out.println(str9);//adc def

        //字符串合字符串 + 等于拼接
        String str10 = "123";
        String str11 = "100";
        System.out.println(str10 + str11);//123100

        //将字符串变为整数
        int num1 = Integer.parseInt(str10);
        int num2 = Integer.parseInt(str11);
        System.out.println(num1 + num2);//223

        String str1000 = "abcdeersdgrewasdfgre";
        //charAt:找到指定字符串中位置的字符
        char ch =str1000.charAt(2);
        System.out.println(ch);//c

        //getChars()方法
        char[] chardst = new char[20]; //定义容量为20的字符数组，用于存储从字符串中提取出的一串字符
        str1000.getChars(0,10,chardst,0);
        System.out.println("字符数组中存放的内容为："+chardst);//输出的是编码
        System.out.println("字符数组中存放的内容为："+ Arrays.toString(chardst));
        System.out.println(chardst); //括号中不可带其他字符串 abcdeersdg

    }
}
