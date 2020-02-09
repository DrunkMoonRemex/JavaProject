package com.io2;

import java.io.*;
import java.util.Date;

/**
 * 对象流
 * 1、写出后读取
 * 2、读取的顺序与写出保持一致
 * 3、不是所有的对象都可以序列化 要实现Serializable
 */
public class ObjectTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //写出--序列化
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(baos));
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
        byte[] datas = baos.toByteArray();
        oos.close();
        System.out.println(datas.length);
        //读取--反序列化
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
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

class Employee implements  Serializable{//必须序列化，否则报java.io.NotSerializableException
    private transient String name;//该数据不需要序列化 读取的时候是个null
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}





