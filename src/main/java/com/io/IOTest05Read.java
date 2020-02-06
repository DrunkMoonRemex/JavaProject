package com.io;

import java.io.*;

/**
 * 文件字符输入流
 * 操作步骤：
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 */
public class IOTest05Read {
    public static void main(String[] args) throws IOException {
        //1、创建源
        File file = new File("D:/IdeaProjects/JavaProject/src/main/resources/abc.txt");
        //2、选择流
        Reader reader = new FileReader(file);
        //3、操作(分段读取)
        char[] chars = new char[3];
        int temp ;
        while ((temp=reader.read(chars))!=-1){
            String string = new String(chars,0,temp);
            System.out.print(string);
        }
        //4、释放资源
        reader.close();
    }

}








