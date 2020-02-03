package com.string;

import org.apache.commons.lang3.StringUtils;

public class Test5StringUtils {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();

        // 判断字符串是否为""或者null
        System.out.println(StringUtils.isEmpty(null));//true
        System.out.println(StringUtils.isEmpty(""));//true
        System.out.println(StringUtils.isEmpty(" "));//false
        System.out.println(StringUtils.isEmpty("bob"));//false
        System.out.println(StringUtils.isEmpty(" bob "));//false

        // 跟上面方法相反
        System.out.println(StringUtils.isNotEmpty(null));//false
        System.out.println(StringUtils.isNotEmpty(""));//false
        System.out.println(StringUtils.isNotEmpty(" "));//true

        // 任意一个参数为空的话，返回true，如果这些参数都不为空的话返回false。
        System.out.println(StringUtils.isAnyEmpty(null));//true
        System.out.println(StringUtils.isAnyEmpty(null, "foo"));//true
        System.out.println(StringUtils.isAnyEmpty("bob", ""));//true
        System.out.println(StringUtils.isAnyEmpty(" bob ", null));//true
        System.out.println(StringUtils.isAnyEmpty(" ", "bar"));//false
        System.out.println(StringUtils.isAnyEmpty("sfg", "bar"));//false


        // 和上一个方法相反 任意一个参数是空，返回false, 所有参数都不为空，返回true
        System.out.println(StringUtils.isNoneEmpty(" bob ", null));//false
        System.out.println(StringUtils.isNoneEmpty(" ", "bar"));//true
        System.out.println(StringUtils.isNoneEmpty("sfg", "bar"));//true

        // 判断字符对象是不是空字符串，注意与isEmpty的区别
        System.out.println(StringUtils.isBlank(null));//true
        System.out.println(StringUtils.isBlank(""));//true
        System.out.println(StringUtils.isBlank(" "));//true
        System.out.println(StringUtils.isBlank("bob"));//false
        System.out.println(StringUtils.isBlank(" bob "));//false

        //移除字符串两端的空字符串
        //如果为空的话，返回空
        System.out.println(StringUtils.trim(null));//null
        System.out.println(StringUtils.trim(""));//""
        System.out.println(StringUtils.trim(" "));//""
        System.out.println(StringUtils.trim(" abc "));//"abc"

    }
}
