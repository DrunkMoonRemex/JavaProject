package com.collection;

import java.io.*;
import java.util.ArrayList;

public class Test03transient implements Serializable {
    public static void main(String[] args) {
        testTransient();
    }

    private static void testTransient() {
        String name1="常规属性",name2="transient修饰的属性";
        Transient test = new Transient(name1, name2);
        System.out.println("序列化前："+test.toString());
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ddd");
        arrayList.add("aaa");
        arrayList.add("ser");
        ObjectOutputStream outStream;
        ObjectInputStream inStream;
        String filePath = "src/main/resources/Transient.obj";
        try {
            outStream = new ObjectOutputStream(new FileOutputStream(filePath));
            outStream.writeObject(test);
            outStream.writeObject(arrayList);

            inStream = new ObjectInputStream(new FileInputStream(filePath));
            Transient readObject = (Transient)inStream.readObject();
            System.out.println("序列化后："+readObject.toString());
            System.out.println(inStream.readObject());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Transient implements  Serializable{
    private String name;
    private transient  String name2;

    public Transient(String name,String name2){
        this.name = name;
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Transient{" +
                "name='" + name + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        s.defaultWriteObject();//这一步是将ArrayList中除了transient的其他数据序列化
        s.writeObject(name2);//则是把先把数组大小序列化，然后再把数组中有值的元素一一序列化
    }
    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
        s.defaultReadObject();
        name2=String.valueOf(s.readObject());
    }
}
