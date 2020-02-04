package com.io;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        /*
            创建目录
            1、mkdir() 确保上级目录存在，上级目录不存在创建失败 如果目录已存在不会重复创建 返回false
            2、mkdirs() 上级目录可以不存在，不存在就一同创建，如果目录已存在不会重复创建 返回false
         */
        File dir = new File("D:/IdeaProjects/JavaProject/dir/test");
        boolean flag = dir.mkdir();
        System.out.println(flag);//没有dir目录 false
        flag = dir.mkdirs();
        System.out.println(flag);//一同创建 true

        //删除目录或文件
        dir = new File("D:/IdeaProjects/JavaProject/dir/test");//要一级一级删
        flag = dir.delete();
        System.out.println(flag);
        dir = new File("D:/IdeaProjects/JavaProject/dir");//如果dir下还有文件或文件夹，是删不掉的
        flag = dir.delete();
        System.out.println(flag);

        /*
            列出下一级
            1、list() 列出下级名称
            2、listFiles() 列出下级File对象
         */
        dir = new File("D:/IdeaProjects/JavaProject");
        //列出下级名称
        String[] subNames = dir.list();
        if (subNames!=null){
            for (String s : subNames){
                System.out.println(s);
            }
        }

        //下级对象
        File[] filNames = dir.listFiles();
        if (filNames!=null){
            for(File f : filNames){
                System.out.println(f.getAbsolutePath());
            }
        }

        //列出所有盘符
        File[] roots = dir.listRoots();
        if (roots!=null){
            for (File f : roots){
                System.out.println(f.getAbsolutePath());
            }
        }

    }
}
