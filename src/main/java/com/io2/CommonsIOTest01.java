package com.io2;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.*;

import java.io.File;
import java.util.Collection;

public class CommonsIOTest01 {
    public static void main(String[] args) {
        //文件大小
        long len = FileUtils.sizeOf(new File("src/main/java/remex.jpg"));
        System.out.println(len);
        //目录大小
        len = FileUtils.sizeOf(new File("src/main/java"));
        System.out.println(len);
        //列出子孙级，null为只有一层
        Collection<File> files = FileUtils.listFiles(new File("src/main/java"),
                EmptyFileFilter.NOT_EMPTY,//文件不为空
                null);//只有一层
        for (File f :files){
            System.out.println(f.getAbsolutePath());
        }
        System.out.println("------------------------");
        //列出子孙级
        files = FileUtils.listFiles(new File("src/main/java"),
                //new SuffixFileFilter("java"),//java后缀
                FileFilterUtils.or(new SuffixFileFilter("java"),new SuffixFileFilter("jpg")) ,//java和jpg后缀
                DirectoryFileFilter.INSTANCE);//子孙级
        for (File f :files){
            System.out.println(f.getAbsolutePath());
        }
    }



}
