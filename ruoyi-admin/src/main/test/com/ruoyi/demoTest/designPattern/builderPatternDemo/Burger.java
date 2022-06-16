package com.ruoyi.demoTest.designPattern.builderPatternDemo;

//汉堡

/**
 * 汉堡需要包装纸和价格两个属性
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
