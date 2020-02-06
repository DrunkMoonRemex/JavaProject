package com.io;

import java.io.*;

/**
 * 文件字符输出流
 * 操作步骤：
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 */
public class IOTest06Write {
    public static void main(String[] args) {
        File file = new File("src/main/resources/io.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file,false);//append - 如果 true ，则字节将被写入文件的末尾而不是开头
            char[] chars = "this is io operation\r\n这是字符串".toCharArray();
            //第一种
            writer.write(chars);
            //第二种
            writer.append("sdfasaga").append("字符串添加");
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








