package com.ruoyi.demoTest.designPattern.factoryDemo;

//长方形
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
