package com.collection;

import java.util.*;

public class Test7hashMap {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("name","zhangsan");
        hashMap.put("age","23");
        hashMap.put("size","3");
        hashMap.put("sex","cool");


        String age = hashMap.get("age");
        System.out.println(age);

        String aaa = hashMap.get("aaa");
        System.out.println(aaa);

        System.out.println(hashMap.size());

        System.out.println(hashMap.isEmpty());

        System.out.println(hashMap.remove("age"));

        Collection<String> values = hashMap.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<String> set = hashMap.keySet();
        for (String string : set) {
            System.out.println(string);
        }

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+","+entry.getValue());
        }

        //迭代器遍历 与get(key)方法结合
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(hashMap.get(key));
        }

        //迭代器遍历 与entry对象结合
        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, String> next = iterator1.next();
            System.out.println(next.getKey()+","+next.getValue());
        }
    }
}
