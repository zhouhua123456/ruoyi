package com.ruoyi.demoTest.designPattern.builderPatternDemo;

/**
 * 百事可乐
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
