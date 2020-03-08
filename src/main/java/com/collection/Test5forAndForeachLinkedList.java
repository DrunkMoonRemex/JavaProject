package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 测试遍历速度  for  foreach  iterator
 */
public class Test5forAndForeachLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0;i<10000;i++){
            list.add(""+i);
        }
        Long before = System.currentTimeMillis();
        //foreach
        for (String s : list) {

        }
        Long after = System.currentTimeMillis();
        System.out.println("LinkedList使用foreach遍历时间："+(after-before));

        //iterator
        before = System.currentTimeMillis();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        after = System.currentTimeMillis();
        System.out.println("LinkedList使用iterator遍历时间："+(after-before));

        //for
        before = System.currentTimeMillis();
        for (int i = 0;i<list.size();i++){
            list.get(i);
        }
        after = System.currentTimeMillis();
        System.out.println("LinkedList使用for遍历时间："+(after-before));
    }
}
