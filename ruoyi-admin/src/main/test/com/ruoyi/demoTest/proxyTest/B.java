package com.ruoyi.demoTest.proxyTest;

public class B implements  A{
    int a = A.a;
    int c = 9;

    @Override
    public void play() {


        System.out.println("a"+a);
        System.out.println("c"+c);

        System.out.println("正常完");
    }

    public void sing(){
        System.out.println("ccc");
    }
}

