package com.ruoyi.demoTest.designPattern.singletonDemo;

public class Demo2 {

    private static  Demo2 INSTANCE;

    private Demo2(){};

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public static Demo2 getInstance(){
        if(INSTANCE == null){
            INSTANCE=new Demo2();
        }
        return INSTANCE;
    }
}
