package com.io;

import java.io.*;

/**
 * 文件拷贝
 */
public class IOTestCopy04 {
    public static void main(String[] args) {
        copy("src/main/java/remex.jpg","src/main/java/remex2.jpg");
    }

    private static void copy(String srcPath, String destPath) {
        InputStream is = null;
        OutputStream os = null;
        byte[] bytes = new byte[1024];
        try {
            is = new FileInputStream(srcPath);
            os = new FileOutputStream(destPath);
            int len;
            while ((len = is.read(bytes))!=-1){
                os.write(bytes,0,len);
                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}








