package com.ruoyi.demoTest.designPattern.builderPatternDemo;

public class B extends A{
    @Override
    public Packing packing() {
        return null;
    }

    @Override
    public float price() {
        return 5.0f;
    }
    public  String name(){return super.name();}
}
