package com.collection;

import java.util.*;

public class Test01Generics {
    public static void main(String[] args) {
        // 这里的”String”就是实际传入的数据类型；
        MyCollection<String> mc = new MyCollection<String>();
        mc.set("aaa", 0);
        mc.set("bbb", 1);
        String str = mc.get(1); //加了泛型，直接返回String类型，不用强制转换;
        System.out.println(str);


        // 以下代码中List、Set、Map、Iterator都是与容器相关的接口;
        List<String> list = new ArrayList<String>();
        Set<Man> mans = new HashSet<Man>();
        Map<Integer, Man> maps = new HashMap<Integer, Man>();
        Iterator<Man> iterator = mans.iterator();
    }
}

class Man{

}

class MyCollection<E> {// E:表示泛型;
    Object[] objs = new Object[5];

    public E get(int index) {// E:表示泛型;
        return (E) objs[index];
    }
    public void set(E e, int index) {// E:表示泛型;
        objs[index] = e;
    }
}