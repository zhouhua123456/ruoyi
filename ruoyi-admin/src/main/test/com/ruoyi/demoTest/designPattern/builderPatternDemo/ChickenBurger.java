package com.ruoyi.demoTest.designPattern.builderPatternDemo;

/**
 * 肌肉汉堡
 */

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }


}
