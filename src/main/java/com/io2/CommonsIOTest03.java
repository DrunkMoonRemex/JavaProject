package com.io2;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 拷贝
 */
public class CommonsIOTest03 {
    public static void main(String[] args) throws Exception {
        //复制文件
        FileUtils.copyFile(new File("src/main/java/remex.jpg"),new File("src/main/java/remex3.jpg"));
        //复制文件到目录
        FileUtils.copyFileToDirectory(new File("src/main/java/remex.jpg"),new File("src/main/resources"));
        //复制目录
        FileUtils.copyDirectory(new File("D:/test"),new File("D:/test2"));
        //复制目录到目录
        FileUtils.copyDirectoryToDirectory(new File("D:/test2"),new File("D:/test"));
        //拷贝url内容
        String url = "https://t8.baidu.com/it/u=2247852322,986532796&fm=79&app=86&size=h300&n=0&g=4n&f=jpeg?sec=1581844429&t=387fb09aae32affb6fd68af8c6646eca";
        SslUtils.ignoreSsl();//忽略ssl整数，否则下载网络图片时报javax.net.ssl.SSLHandshakeException
        FileUtils.copyURLToFile(new URL(url),new File("src/main/java/test.jpg"));

        String string = IOUtils.toString(new URL("http://www.baidu.com"), "UTF-8");
        System.out.println(string);
        String str = IOUtils.toString(new URL("http://www.163.com"), "GBK");
        System.out.println(str);
    }
}
