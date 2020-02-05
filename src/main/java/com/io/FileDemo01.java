package com.io;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        String path = "D:/IdeaProjects/JavaProject/src/remex.jpg";
        //绝对路径
        File src = new File(path);
        System.out.println(src.getAbsolutePath());//D:\IdeaProjects\JavaProject\src\remex.jpg
        //相对路径
        System.out.println(System.getProperty("user.dir"));//当前目录 D:\IdeaProjects\JavaProject
        src = new File("io.jpg");
        System.out.println(src.getAbsolutePath());//D:\IdeaProjects\JavaProject\io.jpg
        //构建一个不存在的文件
        src  = new File("aaa/io2.jpg");
        System.out.println(src.getAbsolutePath());//D:\IdeaProjects\JavaProject\aaa\io2.jpg


    }
}
