package com.ruoyi.demoTest.algorithm.recursion;

public class TestRecursion1 {
    //计算5！
    public static int fac(int n){
        int result = 0;
        //出口
        if(n == 1){
            return 1;
        }else{
            result = n*fac(n-1);
            //3*fac(2)
            //3*(2*fac(1))
            //3*2*1
        }

        return result;
    }

    public static void main(String[] args) {
        int fac = fac(3);
        System.out.println(fac);
    }
}
