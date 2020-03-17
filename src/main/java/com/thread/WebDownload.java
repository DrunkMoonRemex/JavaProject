package com.thread;

import com.io2.SslUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class WebDownload {
    public  void download(String url,String name){
        try {
            SslUtils.ignoreSsl();//忽略ssl整数，否则下载网络图片时报javax.net.ssl.SSLHandshakeException
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("图片下载失败");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
