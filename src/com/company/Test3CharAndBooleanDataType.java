package com.company;

//字符和浮点型测试类
public class Test3CharAndBooleanDataType {
    public static void main(String[] args) {
        char a = 'A';
        char b = '张';
        char c = '\u0061';
        System.out.println(a);//A
        System.out.println(b);//张
        System.out.println(c);//a
        System.out.println(a+b);//24417

        //转义字符
        System.out.println('a'+'b');//195
        System.out.println(""+'a'+'b');//ab
        System.out.println(""+'a'+'\t'+'b');//a    b
        System.out.println(""+'a'+'\''+'b');//a'b

        //boolean
        boolean flag = true;
        if (flag){ //注意不推荐 flag==true,可能出错写成flag=true
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
