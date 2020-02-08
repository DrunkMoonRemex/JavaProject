package com.io2;

import java.io.*;
import java.net.URL;

/**
 * 操作网络流，下载百度的源代码
 */
public class ConVertTest02 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new URL("http://www.baidu.com").openStream(),"UTF-8")//设置字符集
        );
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("src/main/resources/baidu.html"),"UTF-8")//设置字符集
            )

        ){
            String msg;
            while ((msg = bufferedReader.readLine())!=null){
                System.out.println(msg);//可以显示中文
                bw.write(msg);
                bw.newLine();
            }
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void test() {
        try(InputStream is = new URL("http://www.baidu.com").openStream()){
            int len ;
            while ((len = is.read())!=-1){
                System.out.print((char)len);//中文会出现乱码,字节数不够
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
