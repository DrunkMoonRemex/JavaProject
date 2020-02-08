package com.io2;

import java.io.*;

/**
 * 数据流
 * DataOutPutStream
 * DataInputStream
 */
public class DataTest {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(bos));
        dos.writeUTF("UTF是字符串");
        dos.writeInt(18);
        dos.writeBoolean(true);
        dos.writeChar('a');
        dos.flush();
        byte[] datas = bos.toByteArray();
        System.out.println(datas.length);
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        //顺序与写出保持一致,否则报异常
        String readUTF = dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char ch = dis.readChar();
        System.out.println(readUTF+"-"+age+"-"+flag+"-"+ch);
    }

}
















