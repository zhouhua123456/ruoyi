package com.ruoyi.demoTest.designPattern.commandPattern;

//请求类

/**
 * 将所有的请求封装到一个类当中，针对不同的请求，找对应的处理方法
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    //购买
    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    //卖出去
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }

    //将实现类实现的方法全部写到一个类当中，
    public void play(){
        System.out.println("玩一玩看看");
    }
}
