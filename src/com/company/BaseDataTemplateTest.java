package com.company;

//基本数据类型测试
public class BaseDataTemplateTest {
    public static void main(String[] args) {
        int a = 15;//十进制
        int b = 015;//以0开头的是八进制
        int c = 0x15;//以0x开头的是十六进制
        int d = 0b1111;//以0b开头的是二进制

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        byte age = 30;//-128——127 超出会报错
        short salary = 10000;//-32768——32767
        int people = 200000000;//整形常量默认是int类型
        long globalPeople = 7400000000l;//long类型常量需要后面加l或L
    }
}
