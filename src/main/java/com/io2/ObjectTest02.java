package com.io2;

import java.io.*;
import java.util.Date;

/**
 * 对象流
 * 演示序列化成文件，后反序列化从文件读数据
 */
public class ObjectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //写出--序列化
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/resources/obj.serializable")));
        //操作数据类型+数据
        oos.writeUTF("这是字符串 this is string");
        oos.writeInt(18);
        oos.writeBoolean(false);
        //对象
        oos.writeObject("这是object对象，字符串也是对象");
        oos.writeObject(new Date());
        Employee emp = new Employee("zhang",22);
        oos.writeObject(emp);
        oos.flush();
        oos.close();


        //读取--反序列化
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/resources/obj.serializable")));
        //顺序与写出一致
        ois.readUTF();
        ois.readInt();
        ois.readBoolean();

        String str = (String)ois.readObject();
        Date date = (Date) ois.readObject();
        Employee employee = (Employee) ois.readObject();
        if (str instanceof  String && date instanceof Date){
            System.out.println(str+"+_+"+date);
        }
        if (employee instanceof  Employee){
            System.out.println(employee.toString());
        }
        ois.close();
    }
}






