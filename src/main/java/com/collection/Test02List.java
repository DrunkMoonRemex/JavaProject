package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test02List {
    public static void main(String[] args) {
        test01();
        test02();

    }

    /**
     * 测试两个容器之间元素处理
     */
    private static void test02() {
        List<String> list = new ArrayList<String>();
        list.add("remex");
        list.add("高小七");
        list.add("高小八");

        List<String> list2 = new ArrayList<String>();
        list2.add("remex");
        list2.add("张三");
        list2.add("李四");
        System.out.println(list.containsAll(list2)); //false list是否包含list2中所有元素
        System.out.println(list);
        list.addAll(list2); //将list2中所有元素都添加到list中
        System.out.println(list);
        list.removeAll(list2); //从list中删除同时在list和list2中存在的元素
        System.out.println(list);
        list.retainAll(list2); //取list和list2的交集
        System.out.println(list);

    }

    /**
     * 测试add/remove/size/isEmpty/contains/clear/toArrays等方法
     */
    private static void test01() {
        List<String> list = new ArrayList<>();
        boolean empty = list.isEmpty();
        System.out.println(empty);
        list.add("123");
        list.add("sdf");
        list.add("aaa");
        System.out.println(list.isEmpty());
        list.remove(1);
        list.remove("aaa");
        list.contains("123");
        list.add("erwe");
        System.out.println(Arrays.asList(list));
        System.out.println(Arrays.toString(list.toArray()));
        list.clear();

    }

}
