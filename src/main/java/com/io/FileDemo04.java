package com.io;

import java.io.File;

/**
 * 递归
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File src = new File("D:\\IdeaProjects\\JavaProject\\src\\main\\java");
        printNames(src,-1);
    }

    //打印子孙级目录和文件的名称
    private static void printNames(File src,int deep) {
        for (int i = 0 ; i < deep ; i++){
            System.out.print("-");
        }

        if (null != src && src.exists()) {
            System.out.println(src.getName());//打印名称
            if (src.isDirectory()){
                for (File file : src.listFiles()){
                    printNames(file,deep+1);
                }
            }
        }

    }
}
