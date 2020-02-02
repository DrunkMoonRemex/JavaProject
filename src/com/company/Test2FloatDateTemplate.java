package com.company;

import java.math.BigDecimal;

//浮点类型测试
public class Test2FloatDateTemplate {
    public static void main(String[] args) {
        float a = 3.14f; //默认是double类型，转成float需要末尾加f或F
        double b = 6.28;//可加d或D也可不加
        double c = 628E-2;//科学计数法 表示628乘10的负二次方

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        //浮点数是不精确的，一定不要用于比较
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f+"----"+d);
        System.out.println(f == d); //false

        float d1 = 423423423f;
        float d2 = d1+1;
        if (d1==d2){
            System.out.println(d1+"---"+d2);
            System.out.println("d1==d2");
        }else{
            System.out.println("d1!=d2");
        }

        //要比较请使用BigDecimal类，该类实现了任意精度的浮点运算
        BigDecimal bigDecimal = BigDecimal.valueOf(1.0);
        bigDecimal = bigDecimal.subtract(BigDecimal.valueOf(0.1));//subtract 减法，减0.1
        bigDecimal = bigDecimal.subtract(BigDecimal.valueOf(0.1));
        bigDecimal = bigDecimal.subtract(BigDecimal.valueOf(0.1));
        bigDecimal = bigDecimal.subtract(BigDecimal.valueOf(0.1));
        bigDecimal = bigDecimal.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bigDecimal);
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);

        BigDecimal bd = BigDecimal.valueOf(0.1);
        BigDecimal bd2 = BigDecimal.valueOf(1.0/10.0);
        System.out.println(bd+"-----"+bd2);
        System.out.println(bd.equals(bd2));

    }
}










