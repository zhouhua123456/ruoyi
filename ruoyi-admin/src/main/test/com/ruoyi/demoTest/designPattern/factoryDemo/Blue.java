package com.ruoyi.demoTest.designPattern.factoryDemo;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
