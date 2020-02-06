package com.io;

import java.io.*;

/**
 * 图片读取到字节数组中
 * 字节数组输出成文件
 */
public class IOTest09 {
    public static void main(String[] args) {
        byte[] bytes = fileToByteArray("src/main/java/remex.jpg");
        if (bytes!=null){
            System.out.println(bytes.length);
        }
        byteArrayToFile(bytes,"src/main/java/remex-copy.jpg");
    }

    /**
     * 图片读取到字节数组中
     */
    public  static byte[] fileToByteArray(String path){
        InputStream inputStream = null;
        try {
             inputStream = new FileInputStream(path);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024*10];
            int len;
            while ((len = inputStream.read(bytes))!= -1){
                byteArrayOutputStream.write(bytes,0,len);
            }
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
    /**
     * 字节数组输出成文件
     */
    public  static void byteArrayToFile(byte[] bytes,String path){
        OutputStream outputStream = null;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            outputStream = new FileOutputStream(path);
            byte[] bytes1 = new byte[1024*10];
            int len;
            while ((len = byteArrayInputStream.read())!=-1){
                outputStream.write(bytes1,0,len);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
