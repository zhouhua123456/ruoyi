package com.ruoyi.demoTest.algorithm.recursion;

//计算1+1+2+4+8

/**
 *   1  1
 *   2  1
 *   3  2
 *   4  3
 *   5  5
 *   6  8
 */
public class TestRecursion2 {

    public static int  method(int s){
        int result = 0;
        if(s == 1 || s == 2){
            return 1;
        }else{

            result = method(s-1)+method(s-2);
        }
        return result;
    }

    public static void main(String[] args) {
        int method = method(6);
        System.out.println(method);
    }
}
