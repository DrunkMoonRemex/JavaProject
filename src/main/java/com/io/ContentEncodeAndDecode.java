package com.io;

import java.io.UnsupportedEncodingException;

/**
 * 编码：字符串->字节
 * 解码：字节->字符串
 */
public class ContentEncodeAndDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "这是一个字符串";
        //编码：字节数组
        byte[] datas = msg.getBytes();//默认使用工程的字符集
        System.out.println(datas.length);

        //其他字符集
        datas = msg.getBytes("UTF-16LE");
        System.out.println(datas.length);

        //GBK
        datas = msg.getBytes("GBK");
        System.out.println(datas.length);

        //解码：字符串
        /*
        String(byte[] bytes, int offset, int length, String charsetName)
         */
        msg = new String(datas,0,datas.length,"utf-8");//乱码
        System.out.println(msg);
        msg = new String(datas,0,datas.length,"GBK");
        System.out.println(msg);
        msg = new String(datas,0,datas.length-1,"GBK");
        System.out.println(msg);
        /*
        String(byte[] bytes, String charsetName)
         */
        msg = new String(datas,"GBK");
        System.out.println(msg);
        msg = new String(datas,"UTF-8");
        System.out.println(msg);

    }
}
