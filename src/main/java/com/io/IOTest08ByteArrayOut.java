package com.io;

import java.io.*;

/**
 * 字节数组输出流
 * 1、创建源：内部维护
 * 2、选择流：不关联源
 * 3、操作：写出内容
 * 4、释放资源：可以不关闭，close方法是空方法
 *
 * 5、获取数据：toByteArray()
 */
public class IOTest08ByteArrayOut {
    public static void main(String[] args) throws IOException {
        //1、创建源
        //2、选择流
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //3、操作(写出)
        String str = "我要把这个字符串写入到字节数组中";
        byte[] flush = str.getBytes();
        outputStream.write(flush,0,flush.length);
        outputStream.flush();
        //4、获取数据
        byte[] bytes1 = outputStream.toByteArray();
        System.out.println(new String(bytes1));
    }

}








