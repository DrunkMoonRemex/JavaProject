package com.io2;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CommonsIOTest02 {
    public static void main(String[] args) throws IOException {
        //读取文件
        String msg = FileUtils.readFileToString(new File("src/main/java/abc.txt"),"UTF-8");
        System.out.println(msg);
        byte[] bytes = FileUtils.readFileToByteArray(new File("src/main/java/abc.txt"));
        System.out.println(bytes.length);

        //逐行读取
        List<String> msgs = FileUtils.readLines(new File("src/main/java/abc.txt"),"UTF-8");
        for (String s : msgs) {
            System.out.println(s);
        }
        //迭代器方式遍历
        LineIterator lineIterator = FileUtils.lineIterator(new File("src/main/java/abc.txt"), "UTF-8");
        while (lineIterator.hasNext()){
            System.out.println(lineIterator.nextLine());
        }

        //写出文件
        FileUtils.write(new File("src/main/java/abc.txt"),"学习是一件伟大的事业\r\n","UTF-8",false);
        FileUtils.writeStringToFile(new File("src/main/java/abc.txt"),"学习是一件辛苦的事业\r\n","UTF-8",true);
        FileUtils.writeByteArrayToFile(new File("src/main/java/abc.txt"),"学习是一件幸福的事业\r\n".getBytes(StandardCharsets.UTF_8),true);

        //写出列表
        List<String> list = new ArrayList<>();
        list.add("1234sf");
        list.add("dfasfe");
        list.add("sf2323");

        FileUtils.writeLines(new File("src/main/java/abc.txt"),list,"\r\n",true);//lineEnding 每条数据之间的分隔符

    }



}
