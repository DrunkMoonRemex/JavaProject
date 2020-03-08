package com.collection;

import java.util.LinkedList;

public class Test4LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("123");
        list.add("def");
        list.add("dfg");
        list.add("wang");
        list.add("zhang");

        String s = list.get(2);
        System.out.println(s);

    }
}
