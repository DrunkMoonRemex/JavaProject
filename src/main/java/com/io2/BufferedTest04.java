package com.io2;

import java.io.*;

/**
 * 字符缓冲流
 */
public class BufferedTest04 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/io.txt");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file,false));//append - 如果 true ，则字节将被写入文件的末尾而不是开头
            char[] chars = "this is io operation\r\n这是字符串".toCharArray();
            writer.append("这是字符缓冲流写的内容");
            writer.newLine();//换行符
            writer.append("换行后的数据到这里");
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (writer!=null){
                    writer.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
