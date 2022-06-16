package com.ruoyi.demoTest.algorithm.recursion;

import java.util.Random;

//给字符串拼接一个数字1，没有拼成功就一直拼下去。同理可自已定义字符串数组，来替换数字1
public class TestRecursion3 {

    public static String method(String s){
        String result;
        if(s.indexOf("1") != -1){
            return s;
        }else {
            Random random = new Random();
            int i = random.nextInt(10);
            result = method(s.concat(String.valueOf(i)));
        }

        return result;
    }

    public static void main(String[] args) {
        String aa = method("aa");
        System.out.println(aa);

    }
}
