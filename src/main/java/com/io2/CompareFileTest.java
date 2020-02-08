package com.io2;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 文件对比：对比两个文件夹内是否存在相同的文件
 */
public class CompareFileTest {
    public static void main(String[] args) {
        String srcPath = "src/main/java";
        String srcPath2 = "src/main/resources";
        //1、获取到2个文件夹内的所有文件名称
        List<String> fileNames1 = getFileName(srcPath);
        System.out.println(Arrays.asList(fileNames1));
        List<String> fileNames2= getFileName(srcPath2);
        System.out.println(Arrays.asList(fileNames2));
        //2、获取名称相同的文件名
        List<String> sameFileNames = getSameFileNames(fileNames1,fileNames2);
        System.out.println(Arrays.asList(sameFileNames));
        //3、获取名称相同的文件中大小也相同的文件
        List<String> sizeAndFileNameSames = getSizeAndFileNameSames(srcPath,srcPath2,sameFileNames);
        //4、判断名称、大小相同的文件，内容是否相同
        for (String fileName :sizeAndFileNameSames){
            String fileMD5 = getFileMD5(new File(srcPath+"/"+fileName));
            System.out.println(fileName+":"+fileMD5);
            String fileMD52 = getFileMD5(new File(srcPath2+"/"+fileName));
            System.out.println(fileName+":"+fileMD52);
            if (fileMD5.equals(fileMD52)){
                System.out.println(fileName+"在两个文件夹中是完全相同的文件");
            }
        }

    }

    //获取文件的hash值，采用md5算法
    public static String getFileMD5(File file) {
        if (!file.isFile()) {
            return null;
        }
        MessageDigest digest = null;
        FileInputStream in = null;
        byte buffer[] = new byte[8192];
        int len;
        try {
            digest =MessageDigest.getInstance("MD5");
            in = new FileInputStream(file);
            while ((len = in.read(buffer)) != -1) {
                digest.update(buffer, 0, len);
            }
            BigInteger bigInt = new BigInteger(1, digest.digest());
            return bigInt.toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    //读取文件大小，比较大小相同的文件
    private static List<String> getSizeAndFileNameSames(String srcPath, String srcPath2, List<String> sameFileNames) {
        File file = null;
        File file2 = null;
        InputStream is = null;
        List<String> sizeAndFileNameSames = new ArrayList<>();
        for(String name : sameFileNames){
            file = new File(srcPath+"/"+name);
            System.out.println(file.getName()+":"+file.length());
            file2 = new File(srcPath2+"/"+name);
            System.out.println(file2.getName()+":"+file2.length());
            if (file.length()==file2.length()){//比较文件大小
                System.out.println(file.getName());
                sizeAndFileNameSames.add(file.getName());
            }
        }
        return sizeAndFileNameSames;
    }

    //获取2个集合中交集的部分
    private static List<String> getSameFileNames(List<String> fileNames1, List<String> fileNames2) {
        List<String> same = new ArrayList<>(fileNames1);//复制一份
        fileNames1.removeAll(fileNames2);//去除fileNames1中和fileNames2相同的元素
        System.out.println("fileNames1-late:"+Arrays.asList(fileNames1));
        same.removeAll(fileNames1);//找到fileNames1和fileNames2相同的元素
        System.out.println("same:"+Arrays.asList(same));
        return same;
    }

    //获取文件夹中所有的文件（只获取一级）
    private static List<String> getFileName(String srcPath) {
        File file = new File(srcPath);
        File[] files = file.listFiles();
        List<String> fileNames = new ArrayList<>();
        for (File f :files){
            if (f.isFile()){
                fileNames.add(f.getName());
            }
        }
        return fileNames;
    }
}
