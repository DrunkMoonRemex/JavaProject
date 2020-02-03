package com.string;

public class Test2String {
    public static void main(String[] args) {
        String s1 = new String("hello");
        s1.intern();
        String s2 = "hello";
        System.out.println(s1 == s2);//false

        String s3 = new String("hello") + new String(" world");
        s3.intern();
        String s4 = "hello world";
        System.out.println(s3 == s4);//true

        String s5 = new String("ja")+new String("va");
        s5.intern();
        String s6 = "java";
        System.out.println(s5 == s6);//false
    }
}
