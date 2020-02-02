package com.company;

import java.math.BigDecimal;

public class Test8BigDecimal {
    public static void main(String[] args) {
        //float类型的数据存储和整数不一样导致的。它们大部分的时候，都是带有有效数字位
        System.out.println(0.09 + 0.01); // 0.09999999999999999
        System.out.println(1.0 - 0.32);  // 0.6799999999999999
        System.out.println(1.015 * 100); // 101.49999999999999
        System.out.println(1.301 / 100); // 0.013009999999999999
        System.out.println(1.0 - 0.12); // 0.88

        //由于在运算的时候，float类型和double很容易丢失精度，所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
        //BigDecimal类：不可变的、任意精度的有符号十进制数，可以解决数据丢失问题
        System.out.println("---------------------------");
        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.01");
        System.out.println("add:" + bd1.add(bd2)); // 0.10
        System.out.println("-------------------");

        BigDecimal bd3 = new BigDecimal("1.0");
        BigDecimal bd4 = new BigDecimal("0.32");
        System.out.println("subtract:" + bd3.subtract(bd4)); // 0.68
        System.out.println("-------------------");

        BigDecimal bd5 = new BigDecimal("1.015");
        BigDecimal bd6 = new BigDecimal("100");
        System.out.println("multiply:" + bd5.multiply(bd6)); // 101.500
        System.out.println("-------------------");

        BigDecimal bd7 = new BigDecimal("1.301");
        BigDecimal bd8 = new BigDecimal("100");
        System.out.println("divide:" + bd7.divide(bd8)); // 0.01301
        System.out.println("divide:" + bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_UP)); // 0.013
        System.out.println("divide:" + bd7.divide(bd8, 8, BigDecimal.ROUND_HALF_UP)); // 0.01301000


        //使用参数为float或double的BigDecimal创建对象会丢失精度。
        // 因此强烈建议不要使用参数为float或double的BigDecimal创建对象。
        BigDecimal bdTest = new BigDecimal(1.745);
        BigDecimal bdTest1 = new BigDecimal(0.745);

        BigDecimal bdTest3 = new BigDecimal("1.745");
        BigDecimal bdTest4 = new BigDecimal("0.745");

        bdTest = bdTest.setScale(2, BigDecimal.ROUND_HALF_UP);//四舍五入法
        bdTest1 = bdTest1.setScale(2, BigDecimal.ROUND_HALF_UP);

        bdTest3 = bdTest3.setScale(2, BigDecimal.ROUND_HALF_UP);//四舍五入法
        bdTest4 = bdTest4.setScale(2, BigDecimal.ROUND_HALF_UP);

        System.out.println(new BigDecimal(1.745)); // 1.74500000000000010658141036401502788066864013671875
        System.out.println(new BigDecimal(0.745)); // 0.74499999999999999555910790149937383830547332763671875

        System.out.println("bdTest:" + bdTest); // 1.75
        System.out.println("bdTest1:" + bdTest1); // 0.74

        System.out.println("bdTest3:" + bdTest3); // 1.75
        System.out.println("bdTest4:" + bdTest4); // 0.75




    }
}
