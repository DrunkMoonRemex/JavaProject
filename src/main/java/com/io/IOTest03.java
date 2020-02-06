package com.io;

import java.io.*;

/**
 * 文件字节输出流
 * 操作步骤：
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 */
public class IOTest03 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/io.txt");
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file,true);//append - 如果 true ，则字节将被写入文件的末尾而不是开头
            byte[] bytes = "this is io operation".getBytes();
            outputStream.write(bytes);
            outputStream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (outputStream!=null){
                    outputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }

    }

}








