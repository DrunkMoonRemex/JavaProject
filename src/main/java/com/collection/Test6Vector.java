package com.collection;

import java.util.Vector;

public class Test6Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("ade");
        vector.add("cdf");
        vector.add("aaa");
        vector.add("ser");
        vector.remove("aaa");
        vector.remove(1);
        vector.setElementAt("elementAt",1);//更改元素

        vector.contains("cdf");
        vector.indexOf("ser");


    }
}
