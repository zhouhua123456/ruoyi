package com.ruoyi.demoTest.designPattern.builderPatternDemo;

public interface Item {
    //名称
    public String name();

    //打包
    public Packing packing();

    //价格
    public float price();
}
