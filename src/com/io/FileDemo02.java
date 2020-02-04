package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File src  = new File("D:/IdeaProjects/JavaProject/src/remex.jpg");

        //基本信息
        System.out.println(src.getName());//名称 remex.jpg
        System.out.println(src.getPath());//路径 D:\IdeaProjects\JavaProject\src\remex.jpg
        System.out.println(src.getAbsolutePath());//绝对路径 D:\IdeaProjects\JavaProject\src\remex.jpg
        System.out.println(src.getParent());//父路径 没有就返回null D:\IdeaProjects\JavaProject\src
        System.out.println(src.getParentFile().getName());//父对象 src
        src = new File("remex.jpg");
        System.out.println(src.getPath());//路径 remex.jpg
        System.out.println(src.getAbsolutePath());//绝对路径 D:\IdeaProjects\JavaProject\remex.jpg
        System.out.println(src.getParent());// null

        //文件状态
        /*
         * 1、不存在 exists
         * 2、存在
         *      文件：isFile
         *      文件夹：isDirctory
         */
        src  = new File("D:/IdeaProjects/JavaProject/src/remex.jpg");
        System.out.println(src.exists());//true
        System.out.println(src.isFile());//true
        System.out.println(src.isDirectory());//false

        //常用判断
        if (null == src || !src.exists()){
            System.out.println("文件不存在");
        }else{
            if (src.isFile()){
                System.out.println("文件操作");
            }else{
                System.out.println("文件夹操作");
            }
        }

        //文件长度
        System.out.println(src.length());//58499  返回字节数

        //创建文件
        src = new File("D:/IdeaProjects/JavaProject/src/io.txt");
        boolean flag = src.createNewFile();//不存在才创建 创建成功返回true 失败返回false 文件存在也返回false
        System.out.println(flag);

        //删除文件
        flag = src.delete();
        System.out.println(flag);

        //补充 con,com3... 为操作系统的设备名，不能正确创建
        src = new File("D:/IdeaProjects/JavaProject/src/con");
        System.out.println(src.createNewFile());//false

    }
}
