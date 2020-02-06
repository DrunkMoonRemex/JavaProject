package com.io;

import java.io.*;

/**
 * 字节数组输入流
 * 1、创建源：字节数组
 * 2、选择流
 * 3、操作
 * 4、释放资源：可以不关闭，close方法是空方法
 */
public class IOTest07ByteArray {
    public static void main(String[] args) throws IOException {
        //1、创建源
        byte[] bytes = "this is byteArrayInputStream test".getBytes();
        //2、选择流
        InputStream inputStream = new ByteArrayInputStream(bytes);
        //3、操作(分段读取)
        byte[] flush = new byte[4];
        int temp ;
        while ((temp=inputStream.read(flush))!=-1){
            String string = new String(flush,0,temp);
            System.out.println(string);
        }
        //4、释放资源
        inputStream.close();
    }

}








