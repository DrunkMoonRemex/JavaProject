package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件字节输入流
 * 操作步骤：
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 */
public class IOTest02 {
    public static void main(String[] args) throws IOException {
        //1、创建源
        File file = new File("D:/IdeaProjects/JavaProject/src/main/resources/abc.txt");
        //2、选择流
        InputStream inputStream = new FileInputStream(file);
        //3、操作(分段读取)
        byte[] bytes = new byte[3];
        int temp ;
        while ((temp=inputStream.read(bytes))!=-1){
            String string = new String(bytes,0,temp);
            System.out.print(string);
        }
        //4、释放资源
        inputStream.close();
    }

}








