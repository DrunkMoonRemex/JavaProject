package com.io;

import java.io.*;

/**
 * 1、封装拷贝
 * 2、封装释放资源
 * 3、try..with..resource
 */
public class FileUtils {
    public static void main(String[] args) {
        //文件到文件
        try {
            InputStream is = new FileInputStream("src/main/resources/abc.txt");
            OutputStream os = new FileOutputStream("src/main/resources/abc-copy.txt");
            copy(is,os);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //文件到字节数组
        byte[] bytes = null;
        try {
            InputStream is = new FileInputStream("src/main/java/remex.jpg");
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            copy(is,os);
            bytes = os.toByteArray();
            System.out.println(bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //字节数组到文件
        try {
            InputStream is = new ByteArrayInputStream(bytes);
            OutputStream os = new FileOutputStream("src/main/java/remex-copy2.jpg");
            copy(is,os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 1、封装拷贝
     * @param is
     * @param os
     */
    private static void copy(InputStream is,OutputStream os) {
        byte[] bytes = new byte[1024];
        try {
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(is,os);

        }
    }

    /**
     * 2、封装释放资源
     * @param ios
     */
    public static void close(Closeable... ios){
        for(Closeable io:ios){
            if (io!=null){
                try {
                    io.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 3、try..with..resource
     */
    private static void copy2(InputStream is,OutputStream os) {
        /*try (is;os){//jdk9才可以写成try(a,b)的形式，否则得单独声明
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
    //try..with..resource
    private static void copy3(String srcPath, String destPath) {
        try (InputStream is = new FileInputStream(srcPath);
            OutputStream os = new FileOutputStream(destPath)
        ){
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes))!=-1){
                os.write(bytes,0,len);
                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
