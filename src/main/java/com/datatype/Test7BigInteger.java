package com.datatype;

import java.math.BigInteger;

public class Test7BigInteger {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("12312415122");//12312415122超出int长度，以字符串形式传入
        BigInteger bigInteger2 = new BigInteger("12312415120");

        System.out.println(bigInteger.add(bigInteger2));//加
        System.out.println(bigInteger.subtract(bigInteger2));//减
        System.out.println(bigInteger.multiply(bigInteger2));//乘
        System.out.println(bigInteger.divide(bigInteger2));//除

        BigInteger[] arr =  bigInteger.divideAndRemainder(bigInteger2);//返回商和余数的数组 [商，余数]  [1,2]
        for (BigInteger bg :arr){
            System.out.println(bg);
        }

    }
}
