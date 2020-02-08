package com.io2;

import java.io.*;

/**
 * 字节缓冲流
 *
 */
public class BufferedTest01 {
    public static void main(String[] args) throws IOException {
        //1、创建源
        File file = new File("D:/IdeaProjects/JavaProject/src/main/resources/abc.txt");
        //2、选择流
        InputStream inputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        //3、操作(分段读取)
        byte[] bytes = new byte[5];
        int temp ;
        while ((temp=bufferedInputStream.read(bytes))!=-1){
            String string = new String(bytes,0,temp);
            System.out.print(string);
        }
        //4、释放资源
        inputStream.close();//最底层的流先关闭
        bufferedInputStream.close();
    }
}
