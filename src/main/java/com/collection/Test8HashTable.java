package com.collection;

import java.util.Hashtable;

public class Test8HashTable {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("name","zhangsan");
        hashtable.put("age","23");
        hashtable.put("clouse","green");
        hashtable.put("success","money");

        System.out.println(hashtable.get("name"));

        System.out.println(hashtable.isEmpty());

        System.out.println(hashtable.remove("age"));


    }
}
