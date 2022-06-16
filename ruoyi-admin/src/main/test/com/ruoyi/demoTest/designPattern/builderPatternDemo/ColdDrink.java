package com.ruoyi.demoTest.designPattern.builderPatternDemo;

//饮料

/**
 * 饮料需要瓶子和价格
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
