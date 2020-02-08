package com.io2;

import java.io.*;

/**
 * 字符缓冲流
 */
public class BufferedTest03 {
    public static void main(String[] args) throws IOException {
        //1、创建源
        File file = new File("D:/IdeaProjects/JavaProject/src/main/resources/abc.txt");
        //2、选择流
        BufferedReader reader = new BufferedReader(new FileReader(file));
        //3、操作(分段读取)
        String line = null;
        while ((line=reader.readLine())!=null){
            System.out.print(line);
        }
        //4、释放资源
        reader.close();
    }
}
