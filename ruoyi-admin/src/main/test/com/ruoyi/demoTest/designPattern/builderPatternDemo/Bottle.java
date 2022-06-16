package com.ruoyi.demoTest.designPattern.builderPatternDemo;

//瓶子-打包
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
