package com.string;

public class Test2String {
    /*
    返回字符串对象的规范化表示形式。
    一个初始时为空的字符串池，它由类 String 私有地维护。
    当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（该对象由 equals(Object) 方法确定），则返回池中的字符串。否则，将此 String 对象添加到池中，并且返回此 String 对象的引用。
    它遵循对于任何两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true。
    所有字面值字符串和字符串赋值常量表达式都是内部的。
        返回：
        一个字符串，内容与此字符串相同，但它保证来自字符串池中。
     */
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
