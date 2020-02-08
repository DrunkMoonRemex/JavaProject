package com.io2;

import java.io.*;

/**
 * 用字符缓冲流进行存文本文件的拷贝
 */
public class BufferedTest05Copy {
    public static void main(String[] args) {
        copy("src/main/resources/abc.txt","src/main/resources/abc-copy.txt");
    }
    public static void copy(String srcPath, String destPath) {
        try (BufferedReader br = new BufferedReader(new FileReader(srcPath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destPath))){
            String len = null;
            while ((len = br.readLine())!=null){
                bw.append(len);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
