package com.io2;

import java.io.*;

public class BufferedTest02 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/io.txt");
        OutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(file,true));//append - 如果 true ，则字节将被写入文件的末尾而不是开头
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
