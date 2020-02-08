package com.io2;

import java.io.*;

/**
 * 转换流：InputStreamReader OutPutStreamWriter
 * 1、以字符流的形式操作字节流（纯文本）
 * 2、可以指定字符集
 */
public class ConvertTest01 {
    public static void main(String[] args) {
        //操作System.in 和System.out
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            //循环获取键盘的输入（exit退出），输出此内容
            String msg = "";
            while (!"exit".equals(msg)){
                msg = br.readLine();
                bw.write(msg);
                bw.newLine();
                bw.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
