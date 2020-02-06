package com.io;

import java.io.*;

/**
 * 操作步骤：
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 */
public class IOTest01 {
    public static void main(String[] args) throws IOException {
        //1、创建源
        File file = new File("D:/IdeaProjects/JavaProject/src/main/resources/abc.txt");
        //2、选择流
        InputStream inputStream = new FileInputStream(file);
        //3、操作
        int temp ;
        while ((temp=inputStream.read())!=-1){
            System.out.print((char)temp);
        }
        //4、释放资源
        inputStream.close();;
    }

}








